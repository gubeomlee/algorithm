class Solution {
    public String getStr(String[] str, int[][] parts) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<parts.length ; i++) {
            for(int j=parts[i][0] ; j<=parts[i][1] ; j++) {
                sb.append(str[i].charAt(j)); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String[] my_strings, int[][] parts) {
        String answer = getStr(my_strings, parts);
        return answer;
    }
}