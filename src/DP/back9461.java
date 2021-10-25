package DP;

import java.util.Scanner;

public class back9461 {

    public static Long[] dp = new Long[101];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        dp[0]=0L;
        dp[1]=1L;
        dp[2]=1L;
        dp[3]=1L;

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(p(n));
        }
    }

    public static long p(int n) {
        if (dp[n] == null) {  //탐색하지 않은 익덱스 경우 재귀호출
            dp[n] = p(n - 2) + p(n - 3);

        }
        return dp[n];
    }
}
