package Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class back11286 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //절대값 같은 경우 그중에서 작은 값 오름 차순 정렬
        //아닌 경우에는 절대값이 작은 순서로 오름차순 정렬
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) ->
                Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) :
                        Integer.compare(Math.abs(o1), Math.abs(o2)));
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                if (q.isEmpty()) {
                    System.out.println(0);
                } else System.out.println(q.poll());
            } else q.offer(x);
        }
    }
}
