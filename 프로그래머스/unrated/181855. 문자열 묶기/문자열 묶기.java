import java.util.*; 

class Solution {
    public int getCnt(String[] arr) {
        int[] result = new int[31]; 
        for(int i=0 ; i<arr.length ; i++) {
            result[arr[i].length()]++; 
        }
    
        Arrays.sort(result);
        return result[30]; 
    }     
    
    public int solution(String[] strArr) {
        int answer = getCnt(strArr);
        return answer;
    }
}