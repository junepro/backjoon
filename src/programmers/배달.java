package programmers;

//플로이드 알고리즘 이용 https://tosuccess.tistory.com/46?category=853902

public class 배달 {
    public int solution(int N, int[][] road, int K) {

        int[][] map = new int[N][N];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (i == j) {
                    map[i][j] = 0;
                    continue;
                }
                map[i][j] = 500001; //일단 최댓값으로 지정
            }
        }

        for (int i = 0; i < road.length; i++) {
            if(map[road[i][0]-1][road[i][1]-1]<road[i][2]) continue;
            map[road[i][0] - 1][road[i][1] - 1] = road[i][2];
            map[road[i][1] - 1][road[i][0] - 1] = road[i][2];
        }


        for (int k = 0; k < N; k++) {//거쳐가는 정점
            for (int i = 0; i < N; i++) {//시작정점
                for (int j = 0; j < N; j++) {//도착 정점
                    if(i==j) continue;
                    if (map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < map[0].length; i++) {
            if (map[0][i] <= K) {
                cnt++;
            }
        }

        return cnt;
    }
}
