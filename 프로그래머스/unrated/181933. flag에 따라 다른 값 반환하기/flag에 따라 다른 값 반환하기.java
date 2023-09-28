class Solution {
    public int cal(int a, int b, boolean flag) {
        if(flag) {
            return a + b;  
        } else {
            return a - b; 
        }
    }
    
    public int solution(int a, int b, boolean flag) {
        int answer = cal(a, b, flag);
        return answer;
    }
}