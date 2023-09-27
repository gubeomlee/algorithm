class Solution {
    public int getPrice(int p) {
        int rate = 0; 
        if(p >= 500000) {
            rate = 20;
        } else if(p >= 300000) {
            rate = 10; 
        } else if(p >= 100000) {
            rate = 5; 
        }
        
        return p * (100 - rate) / 100;
    }
    
    public int solution(int price) {
        int answer = getPrice(price);
        return answer;
    }
}