package Queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class back11279 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //최대힙  우선순위 높은 숫자 순 이고 낮은 숫자 할려면 뒤에 조건 없애면됨
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                if (q.isEmpty()) {
                    System.out.println(0);

                } else {
                    System.out.println(q.poll());
                }
            } else q.offer(x);
        }
    }
}
