class Solution {
    public String getStr(String str, String alp) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) == alp.charAt(0)) {
                sb.append((char) (str.charAt(i) - 'a' + 'A')); 
            } else {
                sb.append(str.charAt(i)); 
            }
        }
        return sb.toString(); 
    }
    
    public String solution(String my_string, String alp) {
        String answer = getStr(my_string, alp);
        return answer;
    }
}