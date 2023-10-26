import java.util.*; 
class Solution {
    public String getStr(String s) {
        char[] arr = s.toCharArray(); 
        Arrays.sort(arr); 
            
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<arr.length ; i++) {
            sb.append(Character.toString(arr[arr.length - 1 - i])); 
        }
        
        return sb.toString(); 
    }
    
    public String solution(String s) {
        String answer = getStr(s);
        return answer;
    }
}