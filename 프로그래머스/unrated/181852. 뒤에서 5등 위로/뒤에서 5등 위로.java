import java.util.*; 

class Solution {
    public int[] getArr(int[] list) {
        int[] arr = new int[list.length - 5]; 
        Arrays.sort(list); 
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = list[i + 5]; 
        }
        
        return arr; 
    }
    
    public int[] solution(int[] num_list) {
        int[] answer = getArr(num_list);
        return answer;
    }
}