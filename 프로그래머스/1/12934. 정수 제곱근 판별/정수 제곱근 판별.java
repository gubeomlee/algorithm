class Solution {
    public long getNum(long n) {
        long num = 1; 
        while(num * num < n) {
            num++; 
        }
        if(num * num == n) {
            return (num + 1) * (num + 1); 
        } else {
            return -1; 
        }
    }
    
    public long solution(long n) {
        long answer = getNum(n);
        return answer;
    }
}