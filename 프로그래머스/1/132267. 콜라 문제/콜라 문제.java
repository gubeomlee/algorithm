class Solution {
    public int getCnt(int a, int b, int n) {
        int cnt = 0; 
        while(n >= a) {
            cnt += (n / a) * b; 
            n = (n / a) * b + n % a; 
        }
        return cnt; 
    }
    
    public int solution(int a, int b, int n) {
        int answer = getCnt(a, b, n);
        return answer;
    }
}