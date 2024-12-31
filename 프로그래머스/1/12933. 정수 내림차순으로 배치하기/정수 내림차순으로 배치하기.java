import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] s = String.valueOf(n).split("");
        Arrays.sort(s);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) sb.append(s[i]);
 
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}