package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class back9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }

        System.out.println(sb);
        //여는 괄호가 있을 때는 스택에 쌓고 닫는 괄호가 나오면 여는괄호를 꺼내면됨
    }

    public static String solve(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            //여는 괄호 일 경우 스택 넣기
            if (c == '(') {
                stack.push(c);
            }

            //아래는 모두 닫는 괄호
            else if (stack.empty()) {
                return "no";
            } else {
                stack.pop();
            }

        }
        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
