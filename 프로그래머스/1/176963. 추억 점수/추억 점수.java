import java.util.*;

class Solution {
    public int[] getArr(String[] name, int[] y, String[][] p) {
        Map<String, Integer> map = new HashMap<>(); 
        for(int i=0 ; i<name.length ; i++) {
            map.put(name[i], y[i]); 
        }
        
        int[] arr = new int[p.length]; 
        for(int i=0 ; i<p.length ; i++) {
            for(int j=0 ; j<p[i].length ; j++) {
                if(map.containsKey(p[i][j])) {
                    arr[i] += map.get(p[i][j]); 
                }
            }
        }
        
        return arr; 
    }
    
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = getArr(name, yearning, photo);
        return answer;
    }
}