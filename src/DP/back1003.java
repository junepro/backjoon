package DP;


import java.util.Scanner;

public class back1003 {

    static Integer[][] dp = new Integer[42][2];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        dp[0][0] = 1; //N=0 일때 0호출 횟수
        dp[0][1] = 0;
        dp[1][0] = 0; //N=1 일때 0 호출 횟수
        dp[1][1] = 1;

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            fibo(n);
            System.out.println(dp[n][0] + " " + dp[n][1]);

        }

    }

    static Integer[] fibo(int n) {

        if (dp[n][0] == null || dp[n][1] == null) {

            //각 n에 대한 0 호출 횟수와 1호출 횟수 재귀호출

            dp[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
            dp[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];

        }
        //n에대한 0과 1 즉 담고 있는 n을 반환
        return dp[n];


    }

}
