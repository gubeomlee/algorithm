import java.util.*; 

class Solution {
    public String[] getArr(String[] p, String[] c) {
        Map<String, Integer> map = new HashMap<>(); 
        for(int i=0 ; i<p.length ; i++) {
            map.put(p[i], i); 
        }
        
        for(int i=0 ; i<c.length ; i++) {
            int idx = map.get(c[i]); 
            
            String temp = p[idx - 1]; 
            p[idx - 1] = p[idx]; 
            p[idx] = temp; 
            
            map.put(c[i], idx - 1); 
            map.put(temp, idx); 
        }
        
        return p; 
    }
    
    public String[] solution(String[] players, String[] callings) {
        String[] answer = getArr(players, callings);
        return answer;
    }
}