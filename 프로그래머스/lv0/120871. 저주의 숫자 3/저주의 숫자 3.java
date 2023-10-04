class Solution {
    public boolean isValid(int n) {
        if(n % 3 == 0 || Integer.toString(n).contains("3")) {
            return true; 
        }
        return false; 
    }
    
    public int getNum(int n) {
        int num = 0; 
        int cnt = 0; 
        while (cnt < n) {
            num++; 
            while(isValid(num)) {
                num++; 
            }
            cnt++; 
        } 
        return num; 
    }
    
    public int solution(int n) {
        int answer = getNum(n);
        return answer;
    }
}