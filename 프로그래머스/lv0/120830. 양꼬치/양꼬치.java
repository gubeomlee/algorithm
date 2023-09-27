class Solution {
    public int getTotal(int n, int k) {
        return n * 12000 + (k - n / 10) * 2000; 
    } 
    
    public int solution(int n, int k) {
        int answer = getTotal(n, k);
        return answer;
    }
}