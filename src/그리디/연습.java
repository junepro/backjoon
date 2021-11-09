package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 연습 {
    static boolean[] visited = new boolean[100001];
    static int cnt=0, time = 0;
    static int n, k;
    static int[] disit;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        stack.add(k);

        int idx = k;
        while (idx != n) {
            stack.push(disit[idx]);
            idx = disit[idx];
        }



    }

    static void bfs(int start) {
        time = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);


        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int now = q.poll();
                int next;

                next = now - 1;
                if (next >=0 && !visited[next]) {
                    visited[next] = true;
                    disit[next] = now;
                    q.offer(next);

                }
                next = now + 1;
                if (now == k) {
                    cnt++;
                }else if (next <100001 && !visited[next]) {
                    q.offer(next);
                }
                next = now *2;
                if (now == k) {
                    cnt++;
                }else if (next<100001 && !visited[next]) {
                    q.offer(next);
                }

            }
            time++;
        }
    }

}

