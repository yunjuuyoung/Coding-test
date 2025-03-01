class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int sum = 0;

        if (s.charAt(s.length() - 1) == '(') return false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            sum = c == '(' ? sum + 1 : sum - 1;
            if (sum == -1) return false;
        }
        
        answer = sum == 0 ? true : false;

        return answer;
    }
}