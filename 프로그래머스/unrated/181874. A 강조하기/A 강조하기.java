class Solution {
    public String getStr(String str) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                sb.append(Character.toUpperCase(str.charAt(i))); 
            } else {
                sb.append(Character.toLowerCase(str.charAt(i))); 
            }
        }
        return sb.toString(); 
    }
    
    public String solution(String myString) {
        String answer = getStr(myString);
        return answer;
    }
}