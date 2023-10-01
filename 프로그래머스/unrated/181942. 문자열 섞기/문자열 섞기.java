class Solution {
    public String getStr(String str1, String str2) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str1.length() ; i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        return sb.toString(); 
    }
    
    public String solution(String str1, String str2) {
        String answer = getStr(str1, str2); 
        return answer;
    }
}