class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (String info[] : db) {
            if (id_pw[0].equals(info[0]) && id_pw[1].equals(info[1])) {
                answer = "login";
            } else if (id_pw[0].equals(info[0]) && !id_pw[1].equals(info[1])) {
                answer = "wrong pw";
            }
        }
        
        if (answer.equals("")) answer = "fail";
        
        return answer;
    }
}