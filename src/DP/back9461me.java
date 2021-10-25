package DP;


/*1, 1, 1, 2, 2, 3, 4, 5, 7, 9
n=4 ->n-2 +n-3*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class back9461me {

    static int[] dp = new int[100];

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        for (int j = 0; j < n; j++) {

            int t = sc.nextInt();

            for (int i = 3; i < t; i++) {
                dp[i] = -1;
            }
            System.out.println(p(t-1));
        }

    }

    public static int p(int n) {
        if (dp[n] == -1) {
            return dp[n] = p(n - 2) + p(n - 3);
        }
        return dp[n];
    }
}
