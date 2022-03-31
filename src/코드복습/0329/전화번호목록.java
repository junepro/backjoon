package 코드복습;

import java.util.Arrays;

public class 전화번호목록 {

    class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;

            Arrays.sort(phone_book);

            for (int i = 0; i < phone_book.length-1; i++) {
                //startswith 인수로 지정한 문자열로 시작하는 경우 true반환 아니면 false
                if (phone_book[i+1].startsWith(phone_book[i])) {
                    //contains도 사용해봐도됨
                    return false;
                }
            }
            return answer;
        }
    }
}
