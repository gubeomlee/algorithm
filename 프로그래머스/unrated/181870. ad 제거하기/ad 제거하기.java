import java.util.*; 

class Solution {
    public boolean isValid(String str) {
        for(int i=0 ; i<str.length() - 1 ; i++) {
            if(str.charAt(i) == 'a' && str.charAt(i + 1) == 'd') {
                return false; 
            }
        }
        return true; 
    }
    
    public String[] getArr(String[] arr) {
        List<String> result = new ArrayList<>(); 
        for(int i=0 ; i<arr.length ; i++) {
            if(isValid(arr[i])) {
                result.add(arr[i]); 
            }
        }
        return result.toArray(new String[result.size()]); 
    }
    
    public String[] solution(String[] strArr) {
        String[] answer = getArr(strArr);
        return answer;
    }
}