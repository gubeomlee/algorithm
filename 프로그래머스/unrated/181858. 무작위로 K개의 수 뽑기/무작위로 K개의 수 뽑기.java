import java.util.*; 

class Solution {
    public List<Integer> getArr(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>(); 
        for(int i=0 ; i<arr.length ; i++) {
            if(set.add(arr[i])) {
                result.add(arr[i]); 
            }
            if(result.size() == k) {
                break; 
            }
        }
        while(result.size() < k) {
            result.add(-1); 
        }
        return result; 
    }
    
    public List<Integer> solution(int[] arr, int k) {
        List<Integer> answer = getArr(arr, k);
        return answer;
    }
}