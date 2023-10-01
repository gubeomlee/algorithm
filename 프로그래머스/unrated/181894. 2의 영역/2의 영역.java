import java.util.*; 

class Solution {
    public List<Integer> getArr(int[] arr) {
        List<Integer> result = new ArrayList<>(); 
        for(int num : arr) {
            result.add(num); 
        }
        while(result.size() > 0 && result.get(0) != 2) {
            result.remove(0); 
        }
        while(result.size() > 0 && result.get(result.size() - 1) != 2) {
            result.remove(result.size() - 1);
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