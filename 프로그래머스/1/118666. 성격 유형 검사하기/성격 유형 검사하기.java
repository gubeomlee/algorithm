import java.util.*; 

class Solution {
    public String getStr(String[] s, int[] c) {
        Map<Character, Integer> map = new HashMap<>(); 
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        for(int i=0 ; i<s.length ; i++) {
            int idx = 0; 
            if(c[i] >4) {
                idx = 1; 
            }
            map.put(s[i].charAt(idx), map.get(s[i].charAt(idx)) + Math.abs(c[i] - 4)); 
        }
        
        StringBuilder sb = new StringBuilder(); 
        if(map.get('R')>=map.get('T')) {
            sb.append("R"); 
        } else {
            sb.append("T"); 
        }
        if(map.get('C')>=map.get('F')) {
            sb.append("C"); 
        } else {
            sb.append("F"); 
        }
        if(map.get('J')>=map.get('M')) {
            sb.append("J"); 
        } else {
            sb.append("M"); 
        }
        if(map.get('A')>=map.get('N')) {
            sb.append("A"); 
        } else {
            sb.append("N"); 
        }
        
        return sb.toString(); 
    }
    
    public String solution(String[] survey, int[] choices) {
        String answer = getStr(survey, choices);
        return answer;
    }
}