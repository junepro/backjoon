package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back1904 {

    public static Integer dp[] = new Integer[1000001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp[0]=0;
        dp[1]=1;
        dp[2]=2;

        //-1 초기화 배열 비우는 역할
        for (int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }

        System.out.println(Tile(n));

    }

    public static int Tile(int n) {
        if (dp[n] == -1) { //해당 배열 값없을 경우 재귀호출
            dp[n] = (Tile(n - 1) + Tile((n - 2))) % 15746;
        }
        return dp[n];
    }

    //반복분 이용
    public static int TileV1(int a) {

        if (a == 1) {
            return 1;
        }
        if (a == 2) {
            return 2;
        }

        //초기값
        int val1=1;
        int val2=2;
        int sum = 0;

        for (int i = 2; i < a; i++) {
            sum = (val1 + val2) % 15746;
            val1 = val2;
            val2 = sum;
        }

        return sum;
    }

}
