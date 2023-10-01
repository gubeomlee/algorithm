class Solution {
    public int getInt(String ineq, String eq, int n, int m) {
        boolean answer = false; 
        
        if(ineq.equals("<")) {
            if(eq.equals("=")) {
                answer = n <= m; 
            } else {
                answer = n < m; 
            }
        } else {
            if(eq.equals("=")) {
                answer = n >= m;                
            } else {
                answer = n > m;             
            }
        }
        
        return answer ? 1 : 0; 
    }
    
    public int solution(String ineq, String eq, int n, int m) {
        int answer = getInt(ineq, eq, n, m);
        return answer;
    }
}