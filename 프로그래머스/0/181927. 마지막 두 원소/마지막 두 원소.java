class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int a = num_list[num_list.length - 1];
        int b = num_list[num_list.length - 2];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if (a > b)
            answer[answer.length - 1] = answer[answer.length - 2] - answer[answer.length - 3];
        else
            answer[answer.length - 1] = answer[answer.length - 2] * 2;
        
        return answer;
    }
}