class Solution {
    public int getSum(int[][] board, int k) {
        int sum = 0; 
        for(int i=0 ; i<=Math.min(k, board.length-1) ; i++) {
            for(int j=0 ; j<=Math.min(k, board[0].length-1) ; j++) {
                if(i + j <= k) {
                    sum += board[i][j];
                }
            }
        }
        return sum; 
    }
    
    public int solution(int[][] board, int k) {
        int answer = getSum(board, k);
        return answer;
    }
}