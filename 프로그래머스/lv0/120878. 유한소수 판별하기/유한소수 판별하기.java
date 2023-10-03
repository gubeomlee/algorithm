class Solution {
    public int getNum(int a, int b) {
        while (b % 2 == 0) {
            b /= 2; 
        }
        
        while (b % 5 == 0) {
            b /= 5; 
        }
        
        if(a % b == 0) {
            return 1; 
        }
        
        return 2; 
    }
    public int solution(int a, int b) {
        int answer = getNum(a, b);
        return answer;
    }
}