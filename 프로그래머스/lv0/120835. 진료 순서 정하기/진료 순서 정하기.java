import java.util.*; 

class Solution {
    public int[] getArr(int[] em) {
        int len = em.length; 
        int[] matrix = new int[len]; 
        for(int i=0 ; i<len ; i++) {
            matrix[i] = em[i]; 
        }
        
        Arrays.sort(matrix);

        int[] result = new int[len]; 
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len ; j++) {
                if(em[i] == matrix[j]) {
                    result[i] = len - j; 
                }
            }
        }
        return result; 
    }
    
    public int[] solution(int[] emergency) {
        int[] answer = getArr(emergency);
        return answer;
    }
}