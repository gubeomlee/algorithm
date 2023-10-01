import java.util.*; 

class Solution {
    public List<Integer> getArr(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for(int i=0 ; i<arr.length ; i++) {
            if(result.size() == 0) {
                result.add(arr[i]); 
            } else {
                if(result.get(result.size() - 1) < arr[i]) {
                    result.add(arr[i]); 
                } else {
                    result.remove(result.size() - 1); 
                    i--; 
                }
            }
        }
        return result; 
    }
    
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = getArr(arr);
        return stk;
    }
}