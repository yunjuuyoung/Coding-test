class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = "";
        while(age != 0) {
            str += (char)('a' + (age%10));
            age /= 10;
        }
        
        for (int i = str.length() - 1; i >= 0; i--) {
            answer += str.charAt(i);
        }
        
        return answer;
    }
}