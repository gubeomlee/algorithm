class Solution {
    public long getNum(int p, int money, int c) {
        long m = money; 
        for(int i=1 ; i<=c ; i++) {
            m -= i * p; 
        }
        if(m >= 0) {
            return 0; 
        }
        return m * -1; 
    }
    
    public long solution(int price, int money, int count) {
        long answer = getNum(price, money, count);
        return answer;
    }
}