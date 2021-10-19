package 정렬;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class back11650 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        int temp=0;

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (e1, e2) ->{
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1]; //x좌표가 같다면 y기준으로
            } else {
                return e1[0] - e2[0]; //x좌표 기준ㅌ
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
