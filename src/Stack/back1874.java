package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class back1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int start = 0;

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int val = Integer.parseInt(br.readLine());

            if(val>start){

                //start+1 부터 입력받은 val 까지 push한다
                for (int i = start + 1; i <= val; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = val; //다음 push 할때 오름차순 유지 하기위한 변수 초기화
            } else if (stack.peek() != val) {
                System.out.println("no");
                return;
            }

            //top에 있는 원소가 입력받은 값과 같지 않은 경우
            stack.pop();
            sb.append('-').append('\n');

        }

        System.out.println(sb);
        }
    }

