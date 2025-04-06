import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < intStrs.length; i++) {
            String str = intStrs[i].substring(s, s+l);
            int strToInt = Integer.parseInt(str);
            
            if (strToInt > k) list.add(strToInt);
        }
        
        int answer[] = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}