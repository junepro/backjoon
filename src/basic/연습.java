package basic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 연습 {

    static int n;
    static int[][] map;
    static int cnt;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    static ArrayList<Integer> result;

    static boolean[][] check;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        check = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        cnt=0;

        result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !check[i][j]) {
                    cnt = 1;
                    Search(i, j);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int i:result) System.out.println(i);
    }

    public static int Search(int x, int y) {

        check[x][y] = true; //방문함

        for (int i = 0; i < 4; i++) {
            int nx = x + dr[i];
            int ny = y + dc[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < y) {
                if (map[nx][ny] == 1 && !check[nx][ny]) {
                    Search(nx, ny);
                    cnt++;
                }
            }
        }


        return cnt;
    }



}
