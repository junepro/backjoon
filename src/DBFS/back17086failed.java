package DBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class back17086failed {
    static boolean[][] visited;
    static int n, m;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1 ,-1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[][] map;
    static int cnt;
    static int disit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cnt = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    cnt = Math.max(cnt, bfs(i, j));
                }
            }
        }
        System.out.println(cnt);

    }

    static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(new Node(x, y, 0));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Node now = q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (map[nx][ny] == 0 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new Node(nx, ny, now.d + 1));
                        return disit=now.d + 1;
                    }
                }

            }
        }
        return disit;
    }

    static class Node {
        int x,y, d;

        public Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }


}
