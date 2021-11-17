package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 소수 {

    public static void main(String[] args) throws IOException {

        int[] arr = {1, 2, 7, 6, 4};
        System.out.println(solution(arr));

    }


    static public int solution(int[] nums) {
        int cnt = 0;
        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    arrayList.add(sum);
                }
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {

            boolean Prime = true;

            for (int j = 2; j <= Math.sqrt(arrayList.get(i)); j++) {
                if (arrayList.get(i) % j == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                cnt++;
            }
        }

        return cnt;
    }
}

