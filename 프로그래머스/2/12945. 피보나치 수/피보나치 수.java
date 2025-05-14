class Solution {
    public int solution(int n) {
        if (n <= 1) return n;
        
        int answer = 0;
        int f1 = 0;
        int f2 = 1;
    
        for (int i = 0; i < n; i++) {
            f1 = f2; 
            f2 = answer;
            answer = (f1 + f2) % 1234567;
        }
    
        return answer;
    }
}