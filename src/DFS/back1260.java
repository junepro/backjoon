package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class back1260 {

    static int n;
    static int m;
    static int v;
    public static int[][] line;
    static boolean[] visited;

    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        line = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            line[x][y] = 1;
            line[y][x] = 1;
            }

        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();

        visited = new boolean[n + 1];
        bfs(v);
        }


    //dfs 는 스택이나 재귀함수로 품
    //노드 -> 노드이고 다음노드가 없으면 이전노드로 돌아오는 방식식
   public static void dfs(int start) {

       visited[start] = true;
       System.out.print(start + " ");
       for (int i = 1; i < n + 1; i++) {
           if(line[start][i]==1 && !visited[i]) dfs(i);
       }
    }

    //bfs는 큐 이용
    //큐에서 노드 하나 꺼내고 꺼낸노드에서 갈수있는 노드를 큐에 추가
    //갈수잇는 큐가 없으면 break
    public static void bfs(int start) {
        q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int vertex = q.poll();
            System.out.print(vertex + " ");
            for (int i = 1; i < n + 1; i++) {
                if (line[vertex][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
