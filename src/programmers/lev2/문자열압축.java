package programmers.lev2;

public class 문자열압축 {
    public int solution(String s) {
        int answer = s.length();

        //i 압축기준
        for (int i = 1; i <= s.length()/2; i++) {
            int zipLevel = 1;                       //현재 압축정도
            String zipStr = s.substring(0, i);      //압축 문자
            StringBuilder sb = new StringBuilder(); //압축완료 문자 저장

            for (int j = i; j <= s.length(); j+=i) {
                //다음 문자 추출
                String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
                //다음 문자와 현재 문자 같으면 ziplevel 증가
                if (zipStr.equals(next)) {
                    zipLevel++;
                }
                //다음 문자와 현재 문자가 다를 경우
                else {
                    //압축 안될경우 공백, 압축 가능 경우 zipLevel 붙여줌
                    sb.append((zipLevel != 1 ? zipLevel : "") + zipStr);
                    zipStr = next; //다음 문자 압축할 문자로 지정
                    zipLevel = 1; //압축 초기화
                }
            }
            sb.append(zipStr); //마지막 짜투리 문자 추가
            answer = Math.min(answer, sb.length());//가장 작은 문자열 길이 저장
        }

        return answer;
    }
}
