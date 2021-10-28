package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class back2309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 100;
        int size=9;
        int sum=0;

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        boolean cheked = false;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (sum - (arr[i] + arr[j]) == max) {
                    arr[i] = Integer.MIN_VALUE;
                    arr[j] = Integer.MAX_VALUE;
                    cheked = true;
                    break;
                }
                if(cheked) break;

            }

        }
        Arrays.sort(arr);
        for (int ar : arr) {
            if (ar != Integer.MIN_VALUE && ar != Integer.MAX_VALUE) {
                System.out.println(ar);
            }
        }

        br.close();


    }
}
