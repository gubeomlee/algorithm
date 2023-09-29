import java.util.*; 

class Solution {
    public List<Integer> getArr(String str) {
        List<Integer> list = new ArrayList<>(); 
        for(int i=0 ; i<str.length() ; i++) {
            if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                list.add(str.charAt(i) - '0'); 
            }
        }
        Collections.sort(list); 
        return list; 
    }
    
    public List<Integer> solution(String my_string) {
        List<Integer> answer = getArr(my_string);
        return answer;
    }
}