import java.util.*; 

class Solution {
    public List<String> getArr(String[] arr) {
        List<String> result = new ArrayList<>(); 
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i].equals("r")) {
                for(int j=i+1 ; j<arr.length ; j++) {
                    result.add(arr[j]); 
                }
                break; 
            } else if(arr[i].equals("l")) {
                for(int j=0 ; j<i; j++) {
                    result.add(arr[j]); 
                }
                break; 
            }
        }
        return result; 
    }
    
    public List<String> solution(String[] str_list) {
        List<String> answer = getArr(str_list);
        return answer;
    }
}