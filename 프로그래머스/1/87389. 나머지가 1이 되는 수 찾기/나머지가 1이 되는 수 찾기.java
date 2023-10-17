class Solution {
    public int getNum(int n) {
        int num = 2; 
        while(true) {
            if(n % num == 1) {
                return num; 
            } 
            num++; 
        }
    }
    
    public int solution(int n) {
        int answer = getNum(n);
        return answer;
    }
}