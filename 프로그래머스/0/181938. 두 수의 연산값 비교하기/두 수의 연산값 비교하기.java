class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;        
        int s = Integer.parseInt("" + a + b);
        
        if (answer < s)
            answer = s;
            
        return answer;
    }
}