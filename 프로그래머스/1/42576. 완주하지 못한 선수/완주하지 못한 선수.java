import java.util.*;

class Solution {
    public String getName(String[] p, String[] c) {
        Arrays.sort(p); 
        Arrays.sort(c); 
        for(int i=0 ; i<c.length ; i++) {
            if(!c[i].equals(p[i])) {
                return p[i]; 
            }
        }
        return p[p.length - 1]; 
    }
    
    public String solution(String[] participant, String[] completion) {
        String answer = getName(participant, completion);
        return answer;
    }
}