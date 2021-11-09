package DBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class back2667re {
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int  n;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new char[n][n];
        visited = new boolean[n][n];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < n; j++) {
                char ch = s.charAt(j);
                map[i][j] = ch;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && map[i][j] == '1') {
                    cnt = 1;
                    dfs(i, j);
                    arrayList.add(cnt);
                }
            }
        }

        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for(int c:arrayList) System.out.println(c);
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (map[nx][ny] == '1' && !visited[nx][ny]) {
                    dfs(nx, ny);
                    cnt++;
                }
            }
        }
    }

}
