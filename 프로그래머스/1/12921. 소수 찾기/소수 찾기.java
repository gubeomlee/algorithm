class Solution {
    public int getCnt(int n) {
        boolean[] arr = new boolean[n + 1]; 
        for(int i=2 ; i<= n ; i++) {
            for(int j=i + i ; j<=n ; j+=i) {
                arr[j] = true; 
            }
        }
        
        int cnt = -2; 
        for(int i=0 ; i<=n ; i++) {
            if(!arr[i]) {
                cnt++; 
            }
        }
        return cnt; 
    }
    
    public int solution(int n) {
        int answer = getCnt(n);
        return answer;
    }
}