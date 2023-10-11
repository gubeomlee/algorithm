import java.util.*; 

class Solution {
    public int[] getArr(String s) {
        int[] arr = new int[s.length()]; 
        Map<Character, Integer> map = new HashMap<>(); 
        
        for(int i=0 ; i<s.length() ; i++) {
            if(!map.containsKey(s.charAt(i))) {
                arr[i] = -1; 
                map.put(s.charAt(i), i); 
            } else {
                arr[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i), i); 
            }
        }
        return arr; 
    }
    
    public int[] solution(String s) {
        int[] answer = getArr(s);
        return answer;
    }
}