class Solution {
    public int getCnt(int n) {
        int cnt = 0; 
        for(int i=1 ; i<Math.sqrt(n) ; i++){
            if(n % i == 0) {
                cnt++; 
            }
        }
        cnt *= 2;
        if((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            cnt++;
        }
        
        return cnt; 
    }
    
    public int solution(int n) {
        int answer = getCnt(n);
        return answer;
    }
}