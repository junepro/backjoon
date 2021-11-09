package DBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class back13913 {

    static int n, m;
    static boolean[] visited = new boolean[100001];
    static int[] parent = new int[100001];
    static int cnt = 0;
    static int time = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        if (n == m) {
            sb.append(0).append("\n");
            sb.append(1).append("\n");
        } else {
            bfs(n);
            sb.append(time).append("\n");

            Stack<Integer> stack = new Stack<>();
            stack.add(m);

            //스택은 자동 인덱스값 깍여나가는듯??
            int idx = m;
            while (idx != n) {
                stack.push(parent[idx]);
                idx = parent[idx];
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop()).append(" ");
            }
        }
        System.out.println(sb);



    }

    static void bfs(int start) {
        time = 0;

        Queue<Integer> q = new LinkedList<>();

        q.offer(start);

        while (!q.isEmpty()) {
            int size = q.size();

            if (visited[m]) return;

            for (int i = 0; i < size; i++) {
                int now = q.poll();
                int next;

                //next 에서 영역을 방문 처리
                //next 부모를 현재로 설정
                next = now  -1;
                if (next >= 0 && !visited[next]) {
                    visited[next] = true;
                    parent[next] = now;
                    q.offer(next);
                }

                next = now  +1;
                if (next <100001 && !visited[next]) {
                    visited[next] = true;
                    parent[next] = now;
                    q.offer(next);
                }

                next = now*2;
                if (next <100001 && !visited[next]) {
                    visited[next] = true;
                    parent[next] = now;
                    q.offer(next);
                }

            }

            time++;
        }
    }
}
