package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back1541 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;
        String[] sub = br.readLine().split("-");

        for (int i = 0; i < sub.length; i++) {
            int temp=0;

            //뺼셈으로 나뉜 토큰을 덧셈 분리하여 더한다
            String[] add = sub[i].split("\\+");

            //덧셈으로 나뉜 토큰 더한다
            for (int j = 0; j < add.length; j++) {
                temp += Integer.parseInt(add[j]);
            }
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }

        }
        System.out.println(sum);

    }
}
