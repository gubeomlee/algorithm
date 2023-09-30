class Solution {
    public int[][] getMatrix(int n) {
        int[][] matrix = new int[n][n]; 
        for(int i=0 ; i<n ; i++) {
            matrix[i][i] = 1; 
        }
        return matrix; 
    }
    
    public int[][] solution(int n) {
        int[][] answer = getMatrix(n);
        return answer;
    }
}