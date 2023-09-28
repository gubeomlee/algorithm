class Solution {
    public int getCnt(int n, int t) {
        return (int) Math.pow(2, t) * n; 
    }
    
    public int solution(int n, int t) {
        int answer = getCnt(n, t);
        return answer;
    }
}