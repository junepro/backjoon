package basic;

import java.util.Arrays;
import java.util.Scanner;

public class back2609me {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] min = new int[1000];
        int[] arr = new int[1000];
        int[] brr = new int[1000];

        for (int i = 1; i < b; i++) {

            if (a % i == 0 && b % i == 0) {
                min[i] = i;
            }
            arr[i-1] = a * i;
            brr[i-1] = b * i;

        }
        System.out.println(Arrays.stream(min).max().getAsInt());

        boolean chekced = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i] == brr[j]) {
                    System.out.println(arr[i]);
                    chekced = true;
                    break;
                }

                if(chekced) break;

            }
        }

    }
}
