package basic;

import java.util.Scanner;

public class back1978 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean isPrime = true; //소수 true,소수 x false

            int num = sc.nextInt();

            if (num == 1) {
                continue;
            }
            //구하려는 범위의 최댓값의 제곱근까지만 반복하면 된다
            //소수인지 아닌지 확인은 2 ,3,4,5 나눠지는지 아닌지 확인후
            for (int j = 2; j <= Math.sqrt(num); j++) { //제곱근
                if (num % j == 0) {
                    isPrime = false;//소수 아니므로
                    break;
                }
            }
            if (isPrime) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

}
