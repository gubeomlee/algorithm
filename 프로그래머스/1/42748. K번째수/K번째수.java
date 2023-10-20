import java.util.*; 

class Solution {
    public int[] getArr(int[] a, int[][] c) {
        int[] arr = new int[c.length]; 
              
        for(int i=0 ; i<c.length ; i++) {
            int[] subArr = Arrays.copyOfRange(a, c[i][0] - 1, c[i][1]); 
            Arrays.sort(subArr);  
            arr[i] = subArr[c[i][2] - 1]; 
        }
        
        return arr; 
    }
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = getArr(array, commands);
        return answer;
    }
}