import java.util.*; 

class Solution {
    public String getStr(int[] n, String h) {
        StringBuilder sb = new StringBuilder();
        
        Map<Integer, int[]> map = new HashMap<>(); 
        map.put(1, new int[] {0, 0});
        map.put(2, new int[] {0, 1});
        map.put(3, new int[] {0, 2});
        map.put(4, new int[] {1, 0});
        map.put(5, new int[] {1, 1});
        map.put(6, new int[] {1, 2});
        map.put(7, new int[] {2, 0});
        map.put(8, new int[] {2, 1});
        map.put(9, new int[] {2, 2});
        map.put(-1, new int[] {3, 0});
        map.put(0, new int[] {3, 1});
        map.put(-2, new int[] {3, 2});
        
        int left = -1; 
        int right = -2; 
        
        for(int i=0 ; i<n.length ; i++) {
            if(n[i] == 1 || n[i] == 4 || n[i] == 7) {
                sb.append("L"); 
                left = n[i]; 
            } else if(n[i] == 3 || n[i] == 6 || n[i] == 9) {
                sb.append("R"); 
                right = n[i]; 
            } else {
                int[] l = map.get(left); 
                int[] r = map.get(right); 
                int[] t = map.get(n[i]); 
                int lD = Math.abs(l[0] - t[0]) + Math.abs(l[1] - t[1]);
                int rD = Math.abs(r[0] - t[0]) + Math.abs(r[1] - t[1]);
                if(lD > rD) {
                    sb.append("R"); 
                    right = n[i]; 
                } else if(lD < rD) {
                    sb.append("L"); 
                    left = n[i]; 
                } else {
                    if(h.equals("left")) {
                        sb.append("L"); 
                        left = n[i]; 
                    } else {
                        sb.append("R"); 
                        right = n[i]; 
                    }
                }
            }
        }
        
        
        return sb.toString(); 
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = getStr(numbers, hand);
        return answer;
    }
}