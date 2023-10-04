class Solution {
    public int getCnt(int[][] board) {
        int n = board.length;
        int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}}; 
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(board[i][j] == 1) {
                    for(int[] dir : direction) {
                        int r = i + dir[0]; 
                        int c = j + dir[1]; 
                        if(0<= r && r < n && 0 <= c && c < n && board[r][c] == 0) {
                            board[r][c] = 2; 
                        }
                    }                    
                }
            }
        }
        
        int cnt = 0;
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(board[i][j] == 0) {
                    cnt++; 
                }
            }
        }
        return cnt; 
    }
    
    public int solution(int[][] board) {
        int answer = getCnt(board);
        return answer;
    }
}