class Solution {
    public int[] solution(long n) {
        String s = n + "";
        
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < answer.length; i++) {
            char c = s.charAt(i);
            answer[answer.length - i - 1] = c - '0';
        }
        
        return answer;
    }
}