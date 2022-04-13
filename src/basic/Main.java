package basic;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] alright;

    public int solution(String[] grid) {
        int answer = -1;
        n = grid.length;
        Character[][] box = new Character[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                box[i][j] = grid[i].charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                switch (box[i][j] = '?') {
                    case 'a' : bfs('a',i,j);
                        break;

                    case 'b' : bfs('b',i,j);
                        break;

                    case 'c' : bfs('c',i,j);
                        break;


                }
            }
        }

        return answer;
    }

    public void bfs(char c, int x, int y) {
        visited[x][y] = true;
        alright[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && nx < y) {
                if (map[nx][ny] == c && !visited[nx][ny]) {
                    bfs(c, nx, ny);
                    if (map[x][y] != map[nx][ny]) {
                        alright[nx][ny] = false;
                        break;
                    }
                }
            }
        }

    }

}
