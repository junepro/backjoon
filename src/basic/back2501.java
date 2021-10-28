package basic;

import java.util.Scanner;

public class back2501 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();

        int b = sc.nextInt();

        int[] arr = new int[a+1];

        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                arr[i] = b;
            }

        }

        System.out.println(arr[b]);
    }
}
