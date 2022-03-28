package basic;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    }

}

class solution{
    public int solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int max = 0;
        int[] answer = new int[];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i]==win_nums[j]) cnt++;
            }
            if(lottos[i]==0) max = cnt + 1;
        }

        return

        return
    }
}