import java.util.*; 

class Solution {
    public List<Integer> getArr(int[] arr, int d) {
        List<Integer> result = new ArrayList<>(); 
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] % d == 0) {
                result.add(arr[i]); 
            }
        }
        Collections.sort(result); 
        if(result.size() == 0) {
            result.add(-1); 
        }
        return result; 
    }
    
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = getArr(arr, divisor);
        return answer;
    }
}