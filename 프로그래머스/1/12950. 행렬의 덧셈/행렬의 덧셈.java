class Solution {
    public int[][] getSum(int[][] arr1, int[][] arr2) {
        int n = arr1.length; 
        int m = arr1[0].length; 
        
        int[][] result = new int[n][m]; 
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j]; 
            }
        }
        return result; 
    }
    
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = getSum(arr1, arr2);
        return answer;
    }
}