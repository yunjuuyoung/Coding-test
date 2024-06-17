class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for (int i = c - 1; i < my_string.length(); i += m) {
            char a = my_string.charAt(i);
            
            answer += a;
        }
        return answer;
    }
}