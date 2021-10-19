package BF;

import java.util.Scanner;

public class back1018 {

    public static boolean[][] map;
    public static int min = 64;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        map = new boolean[n][m];

        sc.nextLine(); //문자열 입력전 int,string사이 개행 없애주도록

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine().trim(); //trim 양끝 공백 제거

            for (int j = 0; j < m; j++) {
                if (str.charAt(j) =='W') { //색구분
                    map[i][j] = true;
                } else {
                    map[i][j] = false;
                }
            }
        }
        int n_row = n - 7;
        int m_col = m - 7;

        for (int i = 0; i < n_row; i++) {
            for (int j = 0; j < m_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);

    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int cnt=0;

        boolean TF = map[x][y]; //첫번째 칸의 색

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (map[i][j] != TF) { //올바른 색이 아닐 경우
                    cnt++;
                }
                //다음칸 색 바껴야되서 tr -> fal , fal -> tr
                TF = !TF;
            }
            TF = !TF;
        }

        //첫째칸 기준 할떄의 색칠할 수(cnt)와
        //첫째칸 색의 반대 되는 색 기준 할때의
        //색칠 개수(64-cnt)중 최소값을 cnt에 저장

        cnt = Math.min(cnt, 64 - cnt);

        //이전 경우 중 최소값보다 현재 cnt값 더작을 경우 최솟값 갱신
        min = Math.min(min,cnt);
    }

}
