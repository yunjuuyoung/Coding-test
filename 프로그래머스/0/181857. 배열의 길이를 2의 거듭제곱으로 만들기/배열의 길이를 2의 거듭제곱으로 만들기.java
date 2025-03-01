import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int index = 1;
        
        while (index < arr.length) {
            index *= 2;;
        } 
        
        int answer[] = Arrays.copyOf(arr, index);
        
        return answer;
    }
}