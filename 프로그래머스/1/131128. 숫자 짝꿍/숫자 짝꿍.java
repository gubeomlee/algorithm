class Solution {
    public String getStr(String x, String y) {
        int[] cntX = new int[10];
        int[] cntY = new int[10]; 
        for(int i=0 ; i<x.length() ; i++) {
            cntX[x.charAt(i) - '0']++; 
        }
        for(int i=0 ; i<y.length() ; i++) {
            cntY[y.charAt(i) - '0']++; 
        }
        
        StringBuilder sb = new StringBuilder(); 
        for(int i=9 ; i>=0 ; i--) {
            for(int j=0 ; j<Math.min(cntX[i], cntY[i]) ; j++) {
                sb.append(i); 
            }
        }
        
        String result = sb.toString(); 
        
        if(result.length() == 0) {
            return "-1"; 
        }
        
        if(result.charAt(0) == '0') {
            return "0"; 
        }
        
        return result; 
    }
    
    public String solution(String X, String Y) {
        String answer = getStr(X, Y);
        return answer;
    }
}