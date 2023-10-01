class Solution {
    public boolean isValid(int n) {
        for(int i=2 ; i<Math.sqrt(n) + 1 ; i++) {
            if(n % i == 0) {
                return true; 
            }
        }
        return false; 
    }
    
    public int getCnt(int n) {
        int cnt = 0; 
        for(int i=4 ; i<=n ; i++) {
            if(isValid(i)) {
                cnt++; 
            }
        }
        return cnt; 
    }
    
    public int solution(int n) {
        int answer = getCnt(n);
        return answer;
    }
}