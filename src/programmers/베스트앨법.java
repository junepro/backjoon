package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 베스트앨법 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {

            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        ArrayList<String> genre = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            genre.add(key);
        }
        Collections.sort(genre, (o1, o2) -> hashMap.get(o2) - hashMap.get(o1));
        //key값 해당 valude 내림차순으로

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < genre.size(); i++) {
            String g = genre.get(i);
            //해당 장르 음악중 play횟수 가장 큰 인덱스
            int max = 0;
            int firstIdx = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }

            max = 0;
            int secondIdx = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
                    max = plays[j];
                    secondIdx = j;
                }
            }
            list.add(firstIdx);
            if(secondIdx>=0) list.add(secondIdx);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
