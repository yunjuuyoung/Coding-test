import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char bef[] = before.toCharArray();
        char aft[] = after.toCharArray();
        Arrays.sort(bef);
        Arrays.sort(aft);
        
        return (Arrays.equals(bef, aft)) ? 1 : 0;
    }
}