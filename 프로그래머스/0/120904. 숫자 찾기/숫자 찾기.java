class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String st[] = String.valueOf(num).split("");
        
        for (int i = 0; i < st.length; i++) {
            if (st[i].equals(String.valueOf(k))) return i + 1;
        }
        
        return answer;
    }
}