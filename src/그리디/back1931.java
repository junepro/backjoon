package 그리디;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class back1931 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt=0;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

       //끝나느 시간 기준 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int prev_end_time=0;

        for (int i = 0; i < n; i++) {
            //직전 종료시간 다음 회의 시작 시간보다 작거나 같다면 갱신신
            if (prev_end_time <= arr[i][0]) {
                prev_end_time = arr[i][1];
                cnt++;
            }
       }



        System.out.println(cnt);
    }
}
