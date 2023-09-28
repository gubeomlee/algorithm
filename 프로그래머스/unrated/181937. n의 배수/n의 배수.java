class Solution {
    public int isMultiple(int num, int n) {
        if(num % n == 0) {
            return 1; 
        } 
        
        return 0; 
    }
    
    public int solution(int num, int n) {
        int answer = isMultiple(num, n);
        return answer;
    }
}