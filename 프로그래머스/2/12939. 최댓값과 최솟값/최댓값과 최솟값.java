import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String splitedS[] = s.split(" ");
        int toIntArr[] = new int[splitedS.length];
        
        for (int i = 0; i < toIntArr.length; i++) {
            toIntArr[i] = Integer.parseInt(splitedS[i]);
        }
        
        Arrays.sort(toIntArr);
        answer = toIntArr[0] + " " + toIntArr[toIntArr.length - 1];
        
        return answer;
    }
}