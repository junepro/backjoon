package code0327;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class back2206 {

    static int[][] map;
    static boolean[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m,cnt;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.valueOf(str.charAt(j)) - '0';
                }
        }
        visited = new boolean[n][m][2];
        System.out.println(bfs(0, 0));
    }

    static int bfs(int x, int y) {
        Queue<node> q = new LinkedList<>();
        q.add(new node(x, y, 1, 0));
        visited[x][y][0] = true; // 벽을 부수지 않고 방문한
        visited[x][y][1] = true; // 벽을 부시면서 방문

        while (!q.isEmpty()) {
            node now = q.poll();
            if(now.x==n-1 && now.y==m-1) return now.cnt;

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (map[nx][ny] == 0) { //벽이 아닐경우
                        if (!visited[nx][ny][now.wall]) {
                            q.add(new node(nx, ny, now.cnt + 1, now.wall));
                            visited[nx][ny][now.wall] = true;
                        }
                    } else if (map[nx][ny] == 1) {//벽일 경우
                        if (now.wall == 0 && !visited[nx][ny][1]) {
                            q.add(new node(nx, ny, now.cnt + 1, 1));
                            visited[nx][ny][1] = true;
                        }
                    }
                }
                }
            }
        return -1;
        }


    static class node {

        int x;
        int y;
        int cnt;
        int wall;

        public node(int x, int y, int cnt, int wall) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.wall = wall;
        }
    }
}
