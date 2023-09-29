class Solution {
    public int getInt(int[][] matrix) {
        for(int i=0 ; i<matrix.length - 1 ; i++) {
            for(int j=i+1 ; j<matrix.length ; j++) {
                if(matrix[i][j] != matrix[j][i]) {
                    return 0; 
                }
            }
        }
        
        return 1; 
    }
    
    public int solution(int[][] arr) {
        int answer = getInt(arr);
        return answer;
    }
}