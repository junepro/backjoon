package basic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.*;

public class 연습 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;

        String[] sub = br.readLine().split("-");

        for (int i = 0; i < sub.length; i++) {
            int temp = 0;

            String[] add = sub[i].split("\\+");

            System.out.print(add[i] + " ");

        }

    }
}
