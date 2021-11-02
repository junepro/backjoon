package BF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class back3085failed {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][n];
        int cnt = 0;
        int[] eat = new int[n];

        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            str[i]=st.split("");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (str[i][j].equals(str[i][j + 1]))
                {
                    if (j !=n-2 && str[i][j].equals(str[i][j + 2])) {
                        cnt -= 1;
                    }
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
