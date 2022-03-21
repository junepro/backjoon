package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class re {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[][] p = new int[51][51];
        int[] sum = new int[51];
        int big = 0;

        for (int i = 0; i < 10; i++) {
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();

            sum[i] +=p[i][1] -p[i][0];
            sum[i + 1] = sum[i];

        }
        //1292,1978,2309,2460 복습
        System.out.println(Arrays.stream(sum).max().getAsInt());



    }

}
