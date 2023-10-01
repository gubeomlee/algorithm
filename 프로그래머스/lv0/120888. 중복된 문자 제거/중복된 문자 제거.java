import java.util.*; 

class Solution {
    public String getStr(String str) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(set.add(str.charAt(i))) {
                sb.append(str.charAt(i)); 
            }
        }
        return sb.toString(); 
    }
    
    public String solution(String my_string) {
        String answer = getStr(my_string);
        return answer;
    }
}