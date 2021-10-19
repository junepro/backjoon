package BF;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum=0;
        int max=0; //근사치

        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if (max < sum && sum <= m) {
                        max = sum;
                    }
                }
            }

        }

        System.out.println(max);
    }
}
