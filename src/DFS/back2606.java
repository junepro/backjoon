package DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class back2606 {
    static int[][] line;
    static int n, m;
    static boolean[] visited;
    static Queue<Integer> q;
    static int cnt;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        line = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            line[x][y] = 1;
            line[y][x] = 1;
        }

        cnt = 0;
        visited = new boolean[n + 1];
        bfs(1);
        System.out.println(cnt);
    }

    static void dfs(int start) {
        visited[start] = true;

        for (int i = 1; i < n + 1; i++) {
            if(line[start][i]==1 && !visited[i]) dfs(i);
        }

    }

    static void bfs(int start) {
        q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int vertex = q.poll();

            for (int i = 1; i < n + 1; i++) {
                if (line[vertex][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }

    }

}
