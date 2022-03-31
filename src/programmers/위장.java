package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 위장 {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < clothes.length; i++) {
                String type = clothes[i][1];
                map.put(type, map.getOrDefault(type, 1) + 1);
                        //이전 type 이면 type 반환아니면 1
            }
            for (String key : map.keySet()) {
                answer *= map.get(key);
            }
            
            return answer-1; //아예안입는 경우 빼기기
        }
    }
}
