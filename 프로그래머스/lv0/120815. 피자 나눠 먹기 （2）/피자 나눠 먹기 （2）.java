class Solution {
    public int getCnt(int n) {
        int cnt = 1;
        if(n % 6 == 0) {
            n /= 6; 
            return cnt * n; 
        }        
        if(n % 2 == 0) {
            n /= 2; 
        }
        if(n % 3 == 0) {
            n /= 3; 
        }
        
        return cnt * n; 
    }
    
    public int solution(int n) {
        int answer = getCnt(n);
        return answer;
    }
}