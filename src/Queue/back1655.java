package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class back1655 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //최대힙 즉 최소힙 과 최대힙 붙여서 중간값 찾는 방식
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            //사이즈 같을 경우네는 최대힙에 우선
            if (maxQ.size() == minQ.size()) {
                maxQ.add(x);
                if (!minQ.isEmpty() && maxQ.peek() > minQ.peek()) {
                    minQ.add(maxQ.poll());
                    maxQ.add(minQ.poll());
                }
            } else {//사이즈 같지않은 경우는 최대힙이 많기때문에 최소힙에 삽입
                minQ.add(x);
                if (maxQ.peek() > minQ.peek()) {
                    minQ.add(maxQ.poll());
                    maxQ.add(minQ.poll());
                }
            }

            System.out.println(maxQ.peek());

        }
    }

}
