import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for (int i = 0; i < answer.length; i++) {
            String an = "";
            
            for (int j = i; j < my_string.length(); j++) {
                an += my_string.charAt(j);
            }
            answer[i] = an;
        }
        
        Arrays.sort(answer);
            
        return answer;
    }
}