import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x"); 
        ArrayList<String> list = new ArrayList<>();
        for(String str : strArr){
            if(!str.isEmpty()){
                list.add(str);
            }
        }
        String[] answer =  new String[list.size()]; 
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}