class Solution {
    public int isSquare(int n) {
        if(n == Math.pow((int) Math.sqrt(n), 2)) {
            return 1;
        } 
        return 2; 
    }
    
    public int solution(int n) {
        int answer = isSquare(n);
        return answer;
    }
}