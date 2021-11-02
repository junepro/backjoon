package 그리디;

import java.util.Scanner;

public class back11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt=0;

        int[] coin = new int[n];

        for (int i = 0; i < n; i++) {

            coin[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            //현재 동전가치가 k보다 작거나 같아야 구성가능
            if (coin[i] <= k) {
                //현재 가치의 동전으로 구성 할 수 있는 개수
                cnt += (k / coin[i]);
                k = k % coin[i];
            }
        }

        System.out.println(cnt);

    }
}
