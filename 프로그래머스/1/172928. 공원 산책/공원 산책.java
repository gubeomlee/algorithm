import java.util.*; 

class Solution {
    public int[] getArr(String[] p, String[] r) {
        Map<Character, int[]> map = new HashMap<>(); 
        map.put('N', new int[] {-1, 0});
        map.put('S', new int[] {1, 0});
        map.put('W', new int[] {0, -1});
        map.put('E', new int[] {0, 1});
        
        int row = 0; 
        int col = 0; 
        loop: for(int i=0 ; i<p.length ; i++) {
            for(int j=0 ; j<p[i].length() ; j++) {
                if(p[i].charAt(j) == 'S') {
                    row = i; 
                    col = j; 
                    break loop; 
                }
            }
        }
        
        loop: for(int i=0 ; i<r.length ; i++) {
            String[] temp = r[i].split(" "); 
            int len = Integer.parseInt(temp[1]); 
            for(int j=1 ; j<=len ; j++) {
                int dr = row + map.get(temp[0].charAt(0))[0] * j; 
                int dc = col + map.get(temp[0].charAt(0))[1] * j; 
                if(0 <= dr && dr < p.length && 0 <= dc && dc < p[dr].length() && p[dr].charAt(dc) != 'X') { 
                } else {
                    continue loop; 
                }
            }
            row += map.get(temp[0].charAt(0))[0] * len; 
            col += map.get(temp[0].charAt(0))[1] * len; 
        }
        return new int[] {row, col}; 
    }
     
    
    public int[] solution(String[] park, String[] routes) {
        int[] answer = getArr(park, routes);
        return answer;
    }
}