package 정렬;

import java.util.Scanner;

public class back2750counting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
    //range -1000~1000
        boolean[] arr = new boolean[2001];

        for (int i = 0; i < n; i++) {
            arr[sc.nextInt() + 1000] = true;
        }

        for (int i = 0; i < 2001; i++) {
            if (arr[i]) {
                System.out.println(i - 1000);
            }
        }


    }
}
