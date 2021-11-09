package DBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class back14226 {
    static boolean[][] visited;
    static int s;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = Integer.parseInt(br.readLine());

        visited = new boolean[2001][2001];
        bfs();
    }

    public static void bfs() {
        Queue<Step> q = new LinkedList<>();
        q.add(new Step(1, 0, 0));

        while (!q.isEmpty()) {
            Step now = q.poll();

            int emticon_n = now.emoticon_n;
            int clipboard_n = now.clipboard_n;
            int time = now.time;

            if (emticon_n == s) {
                System.out.println(time);
                return;
            }
            if (emticon_n > 0 && emticon_n < 2000) {
                //복사 이전 꺼에 덮어쓰기떄문에 수 변동 x
                if (!visited[emticon_n][emticon_n]) {
                    visited[emticon_n][emticon_n] = true;

                    q.offer(new Step(emticon_n, emticon_n, time + 1));
                }
                //삭제
                if (!visited[emticon_n - 1][clipboard_n]) {
                    visited[emticon_n - 1][clipboard_n] = true;

                    q.offer(new Step(emticon_n - 1, clipboard_n, time + 1));

                }
            }
            //붙여 넣기
            if (clipboard_n > 0 && emticon_n + clipboard_n < 2000) {
                if (!visited[emticon_n + clipboard_n][clipboard_n]) {
                    visited[emticon_n + clipboard_n][clipboard_n] = true;

                    q.offer(new Step(emticon_n + clipboard_n, clipboard_n, time + 1));
                }
            }


        }
    }

    static class Step {
        int emoticon_n; //화면 이모티콘 수
        int clipboard_n;//클립보드 이모티콘 수
        int time;
        public Step(int emoticon_n, int clipboard_n, int time) {
            this.emoticon_n = emoticon_n;
            this.clipboard_n = clipboard_n;
            this.time = time;
        }
    }

}
