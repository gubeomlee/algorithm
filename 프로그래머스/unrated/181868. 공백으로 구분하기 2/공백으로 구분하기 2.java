import java.util.*; 

class Solution {
    public String[] getStr(String str) {
        String[] arr = str.split(" ");
        List<String> list = new ArrayList<>(); 
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i].length() > 0) {
                list.add(arr[i]);
            }
        }
        return list.toArray(new String[list.size()]); 
    }
    
    public String[] solution(String my_string) {
        String[] answer = getStr(my_string);
        return answer;
    }
}