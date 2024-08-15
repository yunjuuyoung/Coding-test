class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char l = letter.charAt(0);
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (l != c)
                answer += c;
        }
        
        return answer;
    }
}