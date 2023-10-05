class Solution {    
    public long getNum(int b, int c) {
        c = Math.min(c, b - c);
        
        long num = 1; 
        int temp = 1; 
        for(int i=0 ; i<c ; i++) {
            num *= b; 
            b--; 
            if(temp <= c) {
                num /= temp; 
                temp++; 
            }
        }
        
        return num; 
    }
    public long solution(int balls, int share) {
        long answer = getNum(balls, share);
        return answer;
    }
}