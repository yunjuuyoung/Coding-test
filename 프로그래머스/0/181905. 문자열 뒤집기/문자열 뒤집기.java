class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder str_r = new StringBuilder(my_string.substring(s, e + 1));
        str_r.reverse();

        String answer = my_string.substring(0, s) + str_r.toString() + my_string.substring(e + 1);

        return answer;
    }
}