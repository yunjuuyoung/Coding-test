import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 입력된 정수를 문자열로 변환
        String s = Integer.toString(n);
        
        for (int i = 0; i < s.length(); i++) {
            // 문자를 숫자로 변환
            answer += Character.getNumericValue(s.charAt(i));
        }

        return answer;
    }
}