class Solution {
    public int solution(String binomial) {
        String st[] = binomial.split(" ");
        
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[2]);
        char op = st[1].charAt(0);
        
        if (op == '+') return a + b;
        else if (op == '-') return a - b;
        else return a * b;
    }
}