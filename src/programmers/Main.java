package programmers;

import java.util.*;

public class Main {
    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        int cnt = 0;

        for (int i = 0; i < scoville.length; i++) {
            q.add(scoville[i]);
        }

        while (q.peek() < K) {
            if (q.size()==1) return -1;

            int a = q.poll();
            int b = q.poll();

            int sum = a + b * 2;

            q.offer(sum);

            cnt++;
        }

        return cnt;


    }


    }
