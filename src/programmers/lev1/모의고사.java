package programmers.lev1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] grade = {0,0,0};

        for (int i = 0; i < answers.length; i++) {
            if(a[i%5]==answers[i]) grade[0]++;
            else if(b[i%8]==answers[i]) grade[1]++;
            else if(c[i%10]==answers[i]) grade[2]++;
        }

        int max = Math.max(Math.max(grade[0], grade[1]),grade[2]); // max값 구하기

        ArrayList<Integer> list = new ArrayList<>();
        if(max==grade[0]) list.add(1); //max값이랑 같으면 넣는다.
        if(max==grade[1]) list.add(2);
        if(max==grade[2]) list.add(3);

        answer = new int[list.size()+1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
