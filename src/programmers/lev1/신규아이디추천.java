package programmers.lev1;

public class 신규아이디추천 {
    class Solution {
        public String solution(String new_id) {
            String answer = new_id.toLowerCase();//소문자변환

            answer = answer.replaceAll("[^-_.a-z0-9]", "");
            //[^-.a-z0-9] 알파벳 소문자,숫자 빼기,밑줄 ,마침표 제외한 모든문자
            answer = answer.replaceAll("[.]{2,}", ".");
            //[.]{2,}:"."문자가 2개이상 반복됨
            answer = answer.replaceAll("^[.]|[.]$", "");
            //[^[.]|[.]$ 처음이나 끝에 위치하는 마침표(.)
            if(answer.equals("")) answer += "a";
            //빈문자에 a삽임
            if (answer.length() >= 16) {
                answer = answer.substring(0, 15);
                answer = answer.replaceAll("^[.]|[.]$", "");
                //맨 마지막이 .으로 끝날경우
            }
            if (answer.length() <= 2) {
                while (answer.length() < 3) {
                    answer += answer.charAt(answer.length() - 1);
                    //하나씩 짤라서 붙여넣기
                }
            }

            return answer;

        }
    }
}
