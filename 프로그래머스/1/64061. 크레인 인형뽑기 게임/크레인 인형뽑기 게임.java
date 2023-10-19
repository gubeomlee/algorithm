import java.util.*; 

class Solution {
    public int getCnt(int[][] b, int[] m) {
        int cnt = 0; 
        Stack<Integer> stack = new Stack<>(); 
        
        loop: for(int i=0 ; i<m.length ; i++) {
            int idx = m[i] - 1; 
            for(int j=0 ; j<b.length ; j++) {
                if(b[j][idx] != 0) {
                    int num = b[j][idx];
                    b[j][idx] = 0; 
                    if(!stack.isEmpty() && stack.peek() == num) {
                        stack.pop();
                        cnt++; 
                    } else {
                        stack.add(num); 
                    }
                    continue loop; 
                }
            }
        }
        
        return cnt * 2; 
    }
    
    public int solution(int[][] board, int[] moves) {
        int answer = getCnt(board, moves);
        return answer;
    }
}