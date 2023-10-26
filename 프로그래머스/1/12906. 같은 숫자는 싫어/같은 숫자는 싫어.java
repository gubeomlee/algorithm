import java.util.*;

public class Solution {
    public List<Integer> getArr(int[] arr) {
        List<Integer> result = new ArrayList<>(); 
        int temp = arr[0]; 
        result.add(arr[0]); 
        for(int i=1 ; i<arr.length ; i++) {
            if(arr[i] != temp) {
                result.add(arr[i]); 
                temp = arr[i]; 
            }
        }
        return result; 
    }
    
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = getArr(arr);
        return answer;
    }
}