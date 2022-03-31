package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 기능개발 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {

            Stack<Integer> stack = new Stack<Integer>();

            for (int i = progresses.length - 1; i >= 0; i--) {
                stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));
            }//9 4 7

            List<Integer> s = new ArrayList<>();

            while (!stack.isEmpty()) {
                int cnt = 1;

                int max = stack.pop();
                while (!stack.isEmpty() && stack.peek() <= max) {
                    cnt++;
                    stack.pop();
                }

                s.add(cnt);
            }

            int[] answer = new int[s.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = s.get(i);
            }

            return answer;
        }

    }
}
