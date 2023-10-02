import java.util.*; 

class Solution {
    public List<Integer> getArr(int[] arr) {
        List<Integer> result = new ArrayList<>(); 
        result.add(arr[0]);
        for(int i=1 ; i<arr.length ; i++) {
            if(result.size() >0 && arr[i] == result.get(result.size() - 1)) {
                result.remove(result.size() - 1); 
            } else {
                result.add(arr[i]); 
            }
        }
        if(result.size() == 0) {
            result.add(-1); 
        }
        return result; 
    }
    
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = getArr(arr);
        return answer;
    }
}