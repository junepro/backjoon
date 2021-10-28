package DP;

import java.util.Scanner;
import java.util.StringTokenizer;

public class back1932 {

    static int[][] arr;
    static Integer[][] dp;
    static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        arr = new int[n][n];
        dp = new Integer[n][n];


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
            
        }

        //가장 마지막 행 값들을 dp 마지막 행에 똑같이 복사
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }

        System.out.println(find(0, 0));


    }

    static int find(int depth, int idx) {
        //마지막행 일경우 현위치 dp값 반환
        if(depth==n-1) return dp[depth][idx];


        if (dp[depth][idx] == null) {
            dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx+1)) + arr[depth][idx];
        }

        return dp[depth][idx];
    }


}
