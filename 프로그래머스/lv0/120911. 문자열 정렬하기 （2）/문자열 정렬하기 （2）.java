import java.util.*; 

class Solution {
    public String getStr(String str) {
        StringBuilder sb = new StringBuilder(); 
        char[] arr = new char[str.length()]; 
        for(int i=0 ; i<str.length() ; i++) {
            arr[i] = Character.toLowerCase(str.charAt(i)); 
        }
        Arrays.sort(arr); 
        for(int i=0 ; i<str.length() ; i++) {
            sb.append(arr[i]); 
        }
        return sb.toString(); 
    } 
    
    public String solution(String my_string) {
        String answer = getStr(my_string);
        return answer;
    }
}