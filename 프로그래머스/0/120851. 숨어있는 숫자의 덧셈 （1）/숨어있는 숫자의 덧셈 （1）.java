class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (c < 65)
                answer += c - 48;
        }
        return answer;
    }
}