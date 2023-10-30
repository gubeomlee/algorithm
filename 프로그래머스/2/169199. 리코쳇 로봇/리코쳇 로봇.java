import java.util.*; 

class Solution {
    public void dfs(char[][] matrix, int[][] check, int[][] direction, int row, int col, int tr, int tc, int temp, int[] result) {
        if(row == tr && col == tc) {
            result[0] = Math.min(result[0], temp); 
        } else if(temp < result[0]) {
            for(int[] dir : direction) {
                int r = row; 
                int c = col; 
                while(0 <= r + dir[0] && r + dir[0] < matrix.length && 0 <= c + dir[1] && c + dir[1] < matrix[0].length && matrix[r + dir[0]][c + dir[1]] != 'D') {
                    r += dir[0]; 
                    c += dir[1]; 
                }
                if(check[r][c] > temp) {
                    check[r][c] = temp; 
                    dfs(matrix, check, direction, r, c, tr, tc, temp + 1, result); 
                }
            }
        } 
    }
    
    public int getCnt(String[] b) {
        int[] result = {Integer.MAX_VALUE};
        char[][] matrix = new char[b.length][b[0].length()];
        int row = 0; 
        int col = 0; 
        int tr = 0; 
        int tc = 0; 
        for(int i=0 ; i<b.length ; i++) {
            for(int j=0 ; j<b[0].length() ; j++) {
                matrix[i][j] = b[i].charAt(j);
                if(matrix[i][j] == 'R') {
                    row = i; 
                    col = j; 
                }
                if(matrix[i][j] == 'G') {
                    tr = i; 
                    tc = j; 
                }
            }
        }
        
        int[][] check = new int[b.length][b[0].length()]; 
        for(int i=0 ; i<b.length ; i++) {
            for(int j=0 ; j<b[0].length() ; j++) {
                check[i][j] = Integer.MAX_VALUE; 
            }
        }
        
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; 
        check[row][col] = 0; 
        dfs(matrix, check, direction, row, col, tr, tc, 0, result); 
        
        if(result[0] == Integer.MAX_VALUE) {
            return -1; 
        }
        return result[0]; 
    }
    
    public int solution(String[] board) {
        int answer = getCnt(board);
        return answer;
    }
}