package DBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class back12851 {

    static int n , m;
    static int time = 0;
    static int cnt=0;
    static boolean[] visited = new boolean[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        //두사람 같은 장소 있는 경우
        if (n == m) {
            System.out.println(0);
            System.out.println(1);
        } else {
            bfs(n);
            System.out.println(time);
            System.out.println(cnt);

        }
    }

    static void bfs(int start) {

        time = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);


        while (!q.isEmpty()) {
            int size = q.size();
            //만난 경우가 1번이라도 있으면 다음 계산은 최소가 아님
            if (cnt!=0) {
                return;
            }

            for (int i = 0; i < size; i++) {
                int now = q.poll();
                //현재 방문 처리
                visited[now] = true;
                int next;

                //다음에 만나는 경우 cnt+1
                //다음에서 못만나는 경우 q에 추가
                next = now - 1;
                if (next == m) {
                    cnt++;
                } else if (next >= 0 && !visited[next]) {
                    q.offer(next);
                }

                next = now + 1;
                if (next == m) {
                    cnt++;
                } else if (next < 100001 && !visited[next]) {
                    q.offer(next);
                }

                next = 2 * now;
                if (next == m) {
                    cnt++;
                } else if (next < 100001 && !visited[next]) {
                    q.offer(next);
                }

            }
            time++;
        }
    }
}
