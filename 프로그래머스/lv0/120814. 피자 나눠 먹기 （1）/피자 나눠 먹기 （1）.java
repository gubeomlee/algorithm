class Solution {
    public int getCnt(int n) {
        int temp = 0; 
        int cnt = 0; 
        while(temp < n) {
            temp += 7; 
            cnt++; 
        }
        
        return cnt; 
    }
    
    public int solution(int n) {
        int answer = getCnt(n);
        return answer;
    }
}