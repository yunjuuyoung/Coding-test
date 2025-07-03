import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int answer = 0;
        
        for(String str : strArr) {
            int len = str.length();
            
            if (map.containsKey(len)) {
                map.replace(len, map.get(len) + 1);
            } else {
                map.put(len, 1);
            }
        }
        
        for (int m : map.values()) {
            if (m > answer) {
                answer = m;
            }
        }
        
        return answer;
    }
}