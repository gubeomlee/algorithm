class Solution {
    public int gcd(int n, int m) {
        while(n % m != 0) {
            int temp = n % m; 
            n = m; 
            m = temp; 
        }
        
        return m; 
    }
    
    public int[] getArr(int n, int m) {
        int gcd = gcd(n, m); 
        return new int[] {gcd, n * m / gcd}; 
    }
    
    public int[] solution(int n, int m) {
        int[] answer = getArr(n, m);
        return answer;
    }
}