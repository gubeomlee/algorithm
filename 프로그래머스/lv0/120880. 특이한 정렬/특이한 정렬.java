import java.util.*; 
class Solution {
    public int[] getArr(int[] nums, int n) {
        int len = nums.length; 
        int[][] matrix = new int[len][2]; 
        for(int i=0 ; i<len ; i++) {
            matrix[i][0] = nums[i]; 
            matrix[i][1] = Math.abs(nums[i] - n); 
        }
        
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0]; 
            }
        });
        
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1]; 
            }
        });
        
        int[] result = new int[len]; 
        for(int i=0 ; i<len ; i++) {
            result[i] = matrix[i][0]; 
        }
        
        return result; 
    }
    
    public int[] solution(int[] numlist, int n) {
        int[] answer = getArr(numlist, n);
        return answer;
    }
}