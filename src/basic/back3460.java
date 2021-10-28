package basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class back3460 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int in = sc.nextInt();
            String by = Integer.toBinaryString(in);
            for (int j = by.length() - 1; j >= 0; j--) {
                if (by.charAt(j) == '1') {
                    System.out.print(by.length()-j-1+" ");
                }
                }
            }


    }
}
