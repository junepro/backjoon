package basic;

import java.util.Scanner;

public class back2581me {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int cnt=0;
        int[] arr = new int[10000];

        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(a); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                cnt++;
                arr[cnt] = i;
            }
        }
        if (cnt == 0) {
            System.out.println("-1");
        }else {
            System.out.println(sum);
            System.out.println(arr[1]);

        }
    }
}
