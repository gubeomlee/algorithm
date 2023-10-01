import java.util.*; 

class Solution {
    public List<Integer> getArr(int[] arr, int[] query) {
        List<Integer> result = new ArrayList<>(); 
        for(int num : arr) {
            result.add(num); 
        }
        for(int i=0 ; i<query.length ; i++) {
            if(i % 2 == 0) {
                result = result.subList(0, query[i] + 1); 
            } else {
                result = result.subList(query[i], result.size()); 
            }
        }
        return result; 
    }
    
    public List<Integer> solution(int[] arr, int[] query) {
        List<Integer> answer = getArr(arr, query);
        return answer;
    }
}