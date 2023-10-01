import java.util.*; 

class Solution {
    public void add(List<Integer> result, int[] arr, int start, int end) {
        for(int i=start ; i<=end ; i++) {
            result.add(arr[i]); 
        } 
    }
    
    public List<Integer> getArr(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();
        add(result, arr, intervals[0][0], intervals[0][1]);
        add(result, arr, intervals[1][0], intervals[1][1]);
    
        return result; 
    }
    
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> answer = getArr(arr, intervals);
        return answer;
    }
}