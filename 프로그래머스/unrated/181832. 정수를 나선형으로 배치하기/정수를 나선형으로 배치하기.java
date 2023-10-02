class Solution {
    public int[][] getMatrix(int n) {
        int[][] matrix = new int[n][n]; 
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int row = 0;
        int col = 0; 
        int dirIdx = 0; 
        for(int i=1 ; i<=n*n ; i++) {
            matrix[row][col] = i;
            int nextR = row + direction[dirIdx][0];
            int nextC = col + direction[dirIdx][1];
            if(0 <= nextR && nextR < n && 0 <= nextC && nextC < n && matrix[nextR][nextC] == 0) {
                row = nextR; 
                col = nextC; 
            } else {
                dirIdx = (dirIdx + 1) % 4; 
                row += direction[dirIdx][0];
                col += direction[dirIdx][1];
            }
        }
        
        return matrix; 
    }
    
    public int[][] solution(int n) {
        int[][] answer = getMatrix(n);
        return answer;
    }
}