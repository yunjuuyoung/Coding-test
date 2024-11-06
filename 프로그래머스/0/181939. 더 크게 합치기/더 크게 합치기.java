class Solution {
    public int solution(int a, int b) {
        String a1 = String.valueOf(a) + String.valueOf(b);
        String b1 = String.valueOf(b) + String.valueOf(a);
        
        if (Integer.parseInt(a1) >= Integer.parseInt(b1)) {
            return Integer.parseInt(a1);
        } else {
            return Integer.parseInt(b1);
        }
    }
}