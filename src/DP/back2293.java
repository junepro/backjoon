package DP;

import java.util.Scanner;

//1을 사용해서 2를 만드는 경우의 수는 1+1로 총 1가지 이다.
//2를 사용해서 2를 만드는 경우의 수는 2로 총 1가지 이다.
//1을 사용해서 3을 만드는 경우의 수는 1+1+1로 총 1가지 이다.
//2를 사용해서 3를 만드는 경우의 수는 1+2로 총 1가지 이다

public class back2293 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coin = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            coin[i] = sc.nextInt();
        }

        int[] dp = new int[k + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = coin[i]; j <= k; j++) {
                dp[j] += dp[j - coin[i]];
            }
            System.out.println();
        }

        System.out.println(dp[k]);


    }
}
