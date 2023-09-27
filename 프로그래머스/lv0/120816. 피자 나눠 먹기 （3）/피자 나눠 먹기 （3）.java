class Solution {
    public int getCnt(int slice, int n) {
        int cnt = 0;
        int temp = 0; 
        while(temp < n) {
            cnt++; 
            temp += slice; 
        }
        return cnt; 
    }
    
    public int solution(int slice, int n) {
        int answer = getCnt(slice, n); 
        return answer;
    }
}