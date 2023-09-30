import java.util.*; 

class Solution {
    public List<String> getArr(String str) {
        List<String> arr = new ArrayList<>(); 
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) == 'x' && sb.length() > 0) {
                arr.add(sb.toString());
                sb = new StringBuilder(); 
            } else if(str.charAt(i) != 'x') {
                sb.append(str.charAt(i)); 
            }
        }
        
        if(str.charAt(str.length() - 1) != 'x') {
            arr.add(sb.toString());
        }
        
        Collections.sort(arr); 
        return arr; 
    }
    
    public List<String> solution(String myString) {
        List<String> answer = getArr(myString);
        return answer;
    }
}