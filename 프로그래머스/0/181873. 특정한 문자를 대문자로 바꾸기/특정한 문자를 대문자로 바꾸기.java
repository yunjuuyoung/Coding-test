class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            String s = Character.toString(c);
            
            if (s.equals(alp))
                answer += Character.toUpperCase(c);
            else
                answer += c;
        }
        return answer;
    }
}