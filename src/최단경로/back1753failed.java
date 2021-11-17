package 최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class back1753failed {

    static int[][] line;
    static int[] dis;
    static boolean[] visited;
    static int v, e;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

         v = Integer.parseInt(st.nextToken());
         e = Integer.parseInt(st.nextToken());
        line = new int[e][e];
        dis = new int[e];

        int start = Integer.parseInt(br.readLine());

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                line[x][y] = d;
                line[y][x] = d;

        }

        visited = new boolean[e + 1];
        bfs(start);
        System.out.println();

    }

    static void bfs(int start) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.println(now);

            for (int i = 0; i < v + 1; i++) {
                if (line[now][i] != 0&& !visited[i]) {
                    q.offer(line[now][i]);
                    visited[i] = true;
                }
            }
        }
    }

}
