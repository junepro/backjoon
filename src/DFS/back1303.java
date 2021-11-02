package DFS;

import java.util.Scanner;

public class back1303 {

    public static Character map[][];
    public static boolean visited[][];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static int b = 0, w=0, n,m, c;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        map = new Character[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                char ch = str.charAt(j);
                map[i][j] = ch;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    c = 1;
                    dfs(map[i][j], i, j);
                    if(map[i][j]=='W') w += (c * c);
                    else b += (c * c);
                }
            }
        }


        System.out.println(w + " " + b);
    }

    public static void dfs(char ch, int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (map[nx][ny] == ch && !visited[nx][ny]) {
                    c++;
                    dfs(ch, nx, ny);
                }
            }
        }
    }
}
