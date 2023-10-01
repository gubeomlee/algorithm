class Solution {
    public String getStr(String str, int s, int e) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(s <= i && i <= e) {
                sb.append(str.charAt(e + s - i)); 
            } else {
                sb.append(str.charAt(i)); 
            } 
        }
        return sb.toString(); 
    }
    
    public String solution(String my_string, int s, int e) {
        String answer = getStr(my_string, s, e);
        return answer;
    }
}