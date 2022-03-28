package code0327;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class back2667 {

    static int n;
    static int[][] map;
    static int cnt;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1}; //상하좌우
    //wmr  -1,0
    //0,-1 현위치 0,+1
    //     +1,0

    static ArrayList<Integer> result; //단지 집의 수 저장

    static boolean[][] check; //방문체크
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        map = new int[n][n];

        check = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        //단지집 숫자
        cnt = 0;
        //단지 집의 수 결과 저장
        result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //현재 위치 1이고 true경우
                if (map[i][j] == 1 && !check[i][j]) {
                    //맨처음인 경우
                    cnt = 1;
                    Search(i, j);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int c:result) System.out.println(c);
    }
    public static int Search(int x, int y)
    {
        check[x][y] = true; //방문한 집 트루
        //4방향 확인인
        for (int i= 0; i < 4; i++) {
            int nx = x + dr[i]; //nx,ny 좌표범위 즉 n*n크기이므로 x,y좌표가 0보단 커야하고 n보단 작아야됨
            int ny = y + dc[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (map[nx][ny] == 1 && !check[nx][ny]) {
                    Search(nx, ny);
                    cnt++;
                }
            }

        }
        return cnt;
    }
}
