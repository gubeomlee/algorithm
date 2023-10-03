import java.util.*; 

class Solution {
    public List<String> getArr(String str, int n) {
        List<String> arr = new ArrayList<>(); 
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            sb.append(str.charAt(i)); 
            if(i % n == n - 1) {
                arr.add(sb.toString()); 
                sb = new StringBuilder(); 
            }
        }
        
        if(sb.toString().length() > 0) {
            arr.add(sb.toString()); 
        }
        
        return arr; 
    }
    
    public List<String> solution(String my_str, int n) {
        List<String> answer = getArr(my_str, n);
        return answer;
    }
}