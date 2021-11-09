package DBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class back7576 {
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;
    static Queue<tomato> q;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        map = new int[n][m];
        q = new LinkedList<tomato>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
                //만약 토마토 익으면
                if(map[i][j]==1) q.add(new tomato(i, j));

            }
        }

        System.out.println(bfs());

    }

    static int bfs() {
        while (!q.isEmpty()) {

            tomato t = q.remove();

            int x = t.x;
            int y = t.y;

            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    //토마토 안익은 경우
                    if(map[nx][ny]==0) {
                        q.add(new tomato(nx, ny));
                        //익은 토마토 추가
                        //익은 날짜 얻기위해
                        map[nx][ny] = map[x][y] + 1;
                    }
                }
            }
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j]==0) return -1;

                result = Math.max(result, map[i][j]);
            }
        }
        //토마토 모두 익은 상태인 경우
        if(result ==1) return 0;
        //걸린 일수는 최대날짜에서 1뺴줘야함 1에서 시작했으니
        else return result - 1;

    }
}

class tomato {
    int x;
    int y;

    public tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
