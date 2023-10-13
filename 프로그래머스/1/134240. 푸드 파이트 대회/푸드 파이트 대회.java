class Solution {
    public String getStr(int[] f) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=1 ; i<f.length ; i++) {
            for(int j=0 ; j<f[i]/2 ; j++) {
                sb.append(i); 
            }
        }
        
        return sb.toString() + "0" + sb.reverse(); 
    }
    
    public String solution(int[] food) {
        String answer = getStr(food);
        return answer;
    }
}