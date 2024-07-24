class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = "" + n;
        
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            answer += c - '0';
        }
        
        return answer;
    }
}