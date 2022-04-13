package programmers.lev2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 더맵게 {
    //섞은 음식의 스코빌 지수 =
    // 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
//우선순위 큐(Priority Queue)는 들어간 순서에 상관없이 우선순위가 높은 데이터가 먼저 나오는 것
    //작은수가 일단 큼
    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> q = new PriorityQueue<>();
        int cnt = 0;

        for (int i = 0; i < scoville.length; i++) {
            q.add(scoville[i]);
        }

        while (q.peek() < K) {
            if(q.size()==1) return -1;

            int a = q.poll();
            int b = q.poll();

            int sum = a + 2 * b;

            q.offer(sum);

            cnt++;
        }

        return cnt;

    }
}
