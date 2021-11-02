package basic2;

import java.util.Scanner;


//자연수 최대값 얻을려면 최대한 많은 수의 자연수를 더해야됨
public class back1789 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sum=0;

        int cnt = 0;

        while (sum < n) {
            sum += cnt;
//            if (sum > n) {
//                break;
//            }
            cnt++;
        }
        System.out.println(cnt-1);

    }
}
