package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back1003v2 {

    static Integer dp[][] = new Integer[42][2];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0][0] = 1; //N=0 일때 0호출 횟수
        dp[0][1] = 0;
        dp[1][0] = 0; //N=1 일때 0 호출 횟수
        dp[1][1] = 1;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {

            int n = Integer.parseInt(br.readLine());
            fibo(n);
            sb.append(dp[n][0] + " " + dp[n][1]).append('\n');

        }
        System.out.println(sb);

    }

    static Integer[] fibo(int n) {
        if (dp[n][0] ==null || dp[n][1] == null) {
            dp[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
            dp[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];
        }

        return dp[n];
    }
}
