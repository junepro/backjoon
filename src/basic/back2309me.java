package basic;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class back2309me {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 9;
        int max = 100;
        int sum = 0;

        int[] smalls = new int[size];

        boolean checked = false;

        for (int i = 0; i < size; i++) {
            smalls[i] = sc.nextInt();
            sum += smalls[i];
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (sum - (smalls[i] + smalls[j]) == max) {
//                    smalls[i] = Integer.MIN_VALUE;
//                    smalls[j] = Integer.MAX_VALUE;
                    smalls[i]=0;
                    smalls[j] = 0;

                    checked = true;
                    break;
                }
                if(checked) break;

            }
        }

        Arrays.sort(smalls);

        for (int small : smalls) {
//            if (small != Integer.MIN_VALUE && small != Integer.MAX_VALUE) {
//                System.out.println(small);
//            }

            if (small != 0) {
                System.out.println(small);
            }
        }

    }
}
