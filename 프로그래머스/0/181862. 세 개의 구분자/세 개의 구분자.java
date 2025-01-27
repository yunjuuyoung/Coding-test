import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        String str = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        String st[] = str.split(" ");
        
        for (String s : st) {
            if (!s.equals("")) list.add(s);
        }
        if(list.size() == 0) list.add("EMPTY");
        
        String answer[] = new String[list.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);
        
        
        
        return answer;
    }
}