package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class back11399 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
//        for (int i = 0; i < n; i++) {  내가한거
//            if(i==0) {total[i] = arr[i];
//                sum += total[i];
//                continue;
//            }
//            total[i] = total[i - 1] + arr[i];
//            sum += total[i];
//        }

        int prev = 0;
        for (int i = 0; i < n; i++) {
            sum += prev + arr[i];
            prev = arr[i];
        }
        System.out.println(sum);
    }
}
