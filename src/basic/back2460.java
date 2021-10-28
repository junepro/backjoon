package basic;

import java.util.Arrays;
import java.util.Scanner;

public class back2460 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] p = new int[51][51];
        int[] sum = new int[51];
        int big=0;

        for (int i = 0; i < 10; i++) {
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();

            sum[i] += p[i][1] - p[i][0];
            sum[i + 1] = sum[i];
        }
        System.out.println(Arrays.stream(sum).max().getAsInt());

    }


}
