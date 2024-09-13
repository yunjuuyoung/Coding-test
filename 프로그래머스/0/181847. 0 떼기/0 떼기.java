class Solution {
    public String solution(String n_str) {
        String answer = "";
        int i;
        
        for (i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') break;
        }
        
        for (; i < n_str.length(); i++) {
            answer += n_str.charAt(i);
        }
        
        return answer;
    }
}