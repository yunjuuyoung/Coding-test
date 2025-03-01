class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int index = 1;
        
        while(index < numLog.length) {
            int num = numLog[index] - numLog[index - 1];
            
            switch (num) {
                case 1 :
                    answer += "w";
                    break;
                case -1 : 
                    answer += "s";
                    break;
                case 10 :
                    answer += "d";
                    break;
                case -10 :
                    answer += "a";
                    break;
            }
            index++;
        }
        
        return answer;
    }
}