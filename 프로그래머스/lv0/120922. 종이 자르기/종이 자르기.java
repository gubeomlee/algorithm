class Solution {
    public int getCnt(int m, int n) {
        return Math.min(m - 1 + m * (n - 1), n - 1 + n * (m - 1)); 
    }
    
    public int solution(int M, int N) {
        int answer = getCnt(M, N);
        return answer;
    }
}