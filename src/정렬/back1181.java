package 정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class back1181 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] str = new String[n];

        sc.nextLine();//개행버림

        for (int i = 0; i < n; i++) {

            str[i] = sc.nextLine();
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //단어 길이 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2); //s1우선
                }
                //그외
                else {
                    return s1.length() - s2.length();
                }
            }
        });
        //compare 양의 정수 리턴할 경우 위치바꾸고 0, 음수일경우 위치 안바꿈

        System.out.println(str[0]);

        for (int i = 1; i < n; i++) {
            //중복되지 안흔ㄴ 경우만
            if (!str.equals(str[i - 1])) System.out.println(str[i]);
        }
    }
}
