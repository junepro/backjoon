package DP;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class back2294 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[k+1];

        int[] coin = new int[n+1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            coin[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = coin[i]; j <= k; j++) {
                dp[j] += dp[j - coin[i]];
            }
        }

        Arrays.sort(dp);
        System.out.println(dp[0]);
    }
}
