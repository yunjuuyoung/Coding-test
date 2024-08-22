class Solution {
    public int solution(int a, int b) {
        int answer = 0;        
        String s = "" + a + b;
        answer = 2 * a * b;
        
        if (answer < Integer.parseInt(s))
            answer = Integer.parseInt(s);
            
        return answer;
    }
}