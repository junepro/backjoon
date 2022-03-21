package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class back1292 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[1002];
        int sum = 0;

        int cnt = 1;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (cnt==1001) break;
                arr[cnt] = i;
                cnt++;
            }
        }
        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }
//  list 이용한 경우
//        for (int i = 0; i < 1000; i++) {
//            for (int j = 0; j <= i; j++) {
//                list.add(i + 1);
//            }
//        }
//        for (int i = 0; i <= b - 1; i++) {
//            sum = list.get(i);
//        }
        System.out.println(sum);
 }


}
