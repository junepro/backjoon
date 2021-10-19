package BF;

import java.util.Scanner;

public class 분해합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result=0;

        for (int i = 0; i < n; i++) {
            int num = i;
            int sum=0; //각자리수 합변수

            while (num != 0) {
                sum += num % 10; //각자리수 더하기기
                num /= 10;
           }

            //i값과 자리수 누적합 같은 경우
            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
