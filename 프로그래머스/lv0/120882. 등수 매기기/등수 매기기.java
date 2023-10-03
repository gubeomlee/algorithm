import java.util.*; 

class Solution {
    public int[] getArr(int[][] score) {
        int len = score.length; 
        int[] sum1 = new int[len];
        int[] sum2 = new int[len];
        int[] arr = new int[len]; 
        for(int i=0 ; i<len ; i++) {
            sum1[i] = sum2[i] = score[i][0] + score[i][1];  
        }
        Arrays.sort(sum2); 
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len ; j++) {
                if(sum1[i] == sum2[j]) {
                    arr[i] = len - j; 
                }
            }
        }
        
        return arr; 
    }
    
    public int[] solution(int[][] score) {
        int[] answer = getArr(score);
        return answer;
    }
}