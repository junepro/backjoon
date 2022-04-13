package programmers.lev2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 오픈채팅방 {
    public String[] solution(String[] record) {

        HashMap<String, String> users = new HashMap<>();
        ArrayList<String> log = new ArrayList<>();

        for (String s : record) {
            StringTokenizer st = new StringTokenizer(s);
            String status = st.nextToken();
            String id = st.nextToken();
            String name = "";

            if (!status.equals("Leave")) {
                name = st.nextToken();
            }

            switch (status) {
                case "Enter":
                    users.put(id, name);
                    log.add(id + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    log.add(id + "님이 나갔습니다");
                    break;
                case "Change":
                    users.put(id, name);
                    break;
            }
        }
        String[] answer = new String[log.size()];
        int idx = 0;
        for (String str : log) {
            int endId = str.indexOf("님");
            String userId = str.substring(0, endId);

            answer[idx++] = str.replace(userId, users.get(userId));
        }

        return answer;
    }
}

