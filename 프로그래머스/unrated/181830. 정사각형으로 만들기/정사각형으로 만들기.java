class Solution {
    public int[][] getMatrix(int[][] arr) {
        int len = Math.max(arr.length, arr[0].length); 
        int[][] matrix = new int[len][len];
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=0 ; j<arr[0].length ; j++) {
                matrix[i][j] = arr[i][j]; 
            }
        }
        
        return matrix; 
    }
    
    public int[][] solution(int[][] arr) {
        int[][] answer = getMatrix(arr);
        return answer;
    }
}