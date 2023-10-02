import java.util.*; 

class Solution {
    public List<String> getArr(String str) {
        List<String> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c') {
                if(sb.toString().length() > 0) {
                    arr.add(sb.toString()); 
                    sb = new StringBuilder(); 
                }
            } else {
                sb.append(str.charAt(i)); 
            }
        }
        if(sb.toString().length() > 0) {
            arr.add(sb.toString()); 
        }
        if(arr.size() == 0) {
            arr.add("EMPTY"); 
        }
        return arr; 
    }
     
    public List<String> solution(String myStr) {
        List<String> answer = getArr(myStr);
        return answer;
    }
}