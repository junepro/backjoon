package programmers.lev2;

import java.util.Stack;
//분할정복 케이스
public class 괄호변환 {
    int pos;
    public String solution(String p) {
        if(p.isEmpty()) return p;

        boolean correct = isCorrect(p);

        String u = p.substring(0, pos);
        String v = p.substring(pos, p.length());

        if(correct)//올바른 문자열인경우
            return u + solution(v); //재귀통해 메소드 호출

        //올바른 문자열 아니면
        String answer = "(" + solution(v) + ")";
        for (int i = 1; i < u.length() - 1; i++) {
            if(u.charAt(i)=='(') answer += ")";
            else answer += "(";
        }

        return answer;

    }

    boolean isCorrect(String str) {

        boolean ret = true;
        int left = 0, right = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                left++;
                stack.push('(');
            } else {
                right++;
                if (stack.isEmpty()) {
                    ret = false;
                } else {
                    stack.pop();
                }
            }
            if (left == right) { //균형잡인 괄호문자열인경우
                //uv 분리부분
                pos = i + 1; //v의 시작위치이자 ,u의 length
                return ret;
            }
        }
        return true;
    }
}
