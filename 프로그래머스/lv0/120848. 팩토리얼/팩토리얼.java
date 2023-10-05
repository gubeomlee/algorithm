class Solution {
    public int getNum(int n) {
        int num = 1; 
        int f = 1; 
        while(f * num <= n) {
            f *= num; 
            num++; 
        }
        
        return num - 1; 
    }
    
    public int solution(int n) {
        int answer = getNum(n);
        return answer;
    }
}