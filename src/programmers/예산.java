package programmers;

import java.util.Arrays;

public class 예산 {

    public static void main(String[] args) {

        int[] arr = {1,3,2,5,4};
        System.out.println(solution(arr, 9));

    }
    public static int solution(int[] d, int budget) {
        int cnt = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {

            if(d[i]>budget) break;

            budget -= d[i];


            cnt++;
        }

        return cnt;
    }

}
