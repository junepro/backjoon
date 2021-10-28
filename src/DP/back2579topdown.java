package DP;

import java.util.Scanner;

public class back2579topdown {

    static int[] arr;

    static Integer[] dp;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        arr = new int[n+1];
        dp = new Integer[n+1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dp[0] = arr[0];
        dp[1] = arr[1];

        //n이 1입력될수 있기 때문에 예외 처리 해줄 필요
        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(find(n));

    }

    static int find(int n) {


        if (dp[n] == null) {
            dp[n] = Math.max(find(n - 2), find(n - 3) + arr[n - 1]) + arr[n];
        }

        return dp[n];

    }
}
