class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            
            if (Character.isLowerCase(a))
                answer += Character.toUpperCase(a);
            else
                answer += Character.toLowerCase(a);
        }
        return answer;
    }
}