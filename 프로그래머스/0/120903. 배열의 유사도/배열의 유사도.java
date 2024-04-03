class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        // s1의 i번째와 
        for (int i = 0; i < s1.length; i++) {
            // s2의 j번째 비교를 위한 for문
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j]))
                    answer++;
            }
        }
        return answer;
    }
}