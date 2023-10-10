import java.util.*; 

class Solution {
    public int[] getArr(String[] k, String[] t) {
        Map<Character, Integer> map = new HashMap<>(); 
        for(int i=0 ; i<k.length ; i++) {
            for(int j=0 ; j<k[i].length() ; j++) {
                char c = k[i].charAt(j); 
                map.putIfAbsent(c, Integer.MAX_VALUE);
                map.put(c, Math.min(j + 1, map.get(c))); 
            }
        }
        
        int[] result = new int[t.length]; 
        for(int i=0 ; i<t.length ; i++) {
            for(int j=0 ; j<t[i].length() ; j++) {
                char c = t[i].charAt(j); 
                if(map.containsKey(c)) {
                    result[i] += map.get(c); 
                } else {
                    result[i] = -1; 
                    break; 
                }
            }
        }
        
        return result; 
    }
    
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = getArr(keymap, targets);
        return answer;
    }
}