package basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back2504 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        Character[] met = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            met[i] = str.charAt(i);
            System.out.print(met[i]);
        }

    }
}
