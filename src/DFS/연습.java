package DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 연습 {
    static long a, b;
    static int cnt;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        a = sc.nextLong();
        b = sc.nextLong();

    }

    static long bfs() {
        int cnt=0;
        Queue<Long> q = new LinkedList<>();

        q.add(a);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                long now = q.poll();

                if(now ==b) return cnt+1;

                if(now*2<=b) q.add(now * 2);
                if(now*10+1<=b) q.add(now * 10 + 1);

            }
            cnt++;
        }
    }

}
