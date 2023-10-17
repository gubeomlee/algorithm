class Solution {
    public long getNum(int p, long m, int c) {
        long result = (long) c * (c + 1) / 2 * p - m;
        if(result < 0) {
            return 0; 
        }
        return result; 
    }
    
    public long solution(int price, long money, int count) {
        long answer = getNum(price, money, count);
        return answer;
    }
}