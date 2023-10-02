import java.util.*; 

class Solution {
    public boolean checkSize(int len) {
        while(len > 1) {
            if(len % 2 == 1) {
                return true; 
            }
            len /= 2; 
        }
        return false; 
    }
    
    public List<Integer> getArr(int[] arr) {
        List<Integer> result = new ArrayList<>(); 
        for(int num : arr) {
            result.add(num); 
        }
        
        while(checkSize(result.size())) {
            result.add(0); 
        }
        
        return result; 
    }
    
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = getArr(arr);
        return answer;
    }
}