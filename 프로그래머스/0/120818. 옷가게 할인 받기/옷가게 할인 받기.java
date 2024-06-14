class Solution {
    public int solution(int price) {
        
        if (500000 <= price)  price -= price * 0.2;
        else if (300000 <= price) price -= price * 0.1;
        else if (100000 <= price) price -= price * 0.05;
            
        return price;
    }
}