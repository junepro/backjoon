package programmers.lev1;

public class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        int left = 10, right = 12; //시작위치 초기화
        int l_dis, r_dis;
        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                sb.append("L");
                left = n;
            } else if (n == 3 || n == 6 || n == 9) {
                sb.append("R");
                right = n;
            } else {
                if(n==0) n +=11;
                l_dis = (Math.abs(n - left)) / 3 + (Math.abs(n - left)) % 3;
                r_dis = (Math.abs(n - right)) / 3 + (Math.abs(n - right)) % 3;

                if (l_dis == r_dis) {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = n;
                    } else {
                        sb.append("L");
                        left = n;
                    }
                } else if (l_dis > r_dis) {
                    sb.append("R");
                    right = n;
                } else {
                    sb.append("L");
                    left = n;
                }

            }
        }
        return sb.toString();
    }
}
