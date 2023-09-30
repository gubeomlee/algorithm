import java.util.*; 

class Solution {
    public String[] getStr(String str) {
        String[] arr = new String[str.length()]; 
        for(int i=0 ; i<str.length() ; i++) {
            arr[i] = str.substring(i); 
        }
        Arrays.sort(arr); 
        return arr; 
    }
    
    public String[] solution(String my_string) {
        String[] answer = getStr(my_string);
        return answer;
    }
}