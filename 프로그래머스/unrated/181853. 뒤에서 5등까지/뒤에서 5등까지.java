import java.util.*; 

class Solution {
    public int[] getArr(int[] list) {
        Arrays.sort(list); 
        int[] arr = new int[5]; 
        for(int i=0 ; i<5 ; i++) {
            arr[i] = list[i]; 
        }
        
        return arr; 
    }
    
    public int[] solution(int[] num_list) {
        int[] answer = getArr(num_list);
        return answer;
    }
}