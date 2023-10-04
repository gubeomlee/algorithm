import java.util.*; 
class Solution {
    public int[] getIdx(String[] key, int[] board) {
        Map<String, int[]> map = new HashMap<>(); 
        map.put("up", new int[] {0, 1});
        map.put("down", new int[] {0, -1});
        map.put("left", new int[] {-1, 0});
        map.put("right", new int[] {1, 0});
        
        int rLen = (board[0] - 1) / 2; 
        int cLen = (board[1] - 1) / 2; 
        
        int row = 0; 
        int col = 0; 
        for(int i=0 ; i<key.length ; i++) {
            int r = row + map.get(key[i])[0]; 
            int c = col + map.get(key[i])[1]; 
            
            if(-1 * rLen <= r && r <= rLen && -1 * cLen <= c && c <= cLen)  {
                row = r; 
                col = c; 
            }
        }
        
        return new int[] {row, col}; 
    }
    
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = getIdx(keyinput, board);
        return answer;
    }
}