import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        String st[] = myString.split("x", -1);
        
        for (int i = 0; i < st.length; i++) {
            list.add(st[i].length());
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i).intValue();
        
        return answer;
    }
}