package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back2581 {

    public static boolean prime[];//소수 체크할 배열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        prime = new boolean[n + 1]; //소수 배열
        get_prime();

        int sum=0;
        int min = Integer.MAX_VALUE;
        for (int i = m; i <= n; i++) {
            if (prime[i] == false) {
                sum += i;
                if (min == Integer.MAX_VALUE) { //첫소수가 최솟값
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);

        } else {
            System.out.println(sum);
            System.out.println(min);

        }

        //소수 합 및 최솟값

    }
    //에라토스테네스 체 알고리즘
    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;//이미 체크된 배열경우 skip 즉 값이 있으면면
           for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
