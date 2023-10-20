import java.util.*; 

class Solution {
    public int getScore(int[] a, int[] p) {
        int score = 0;
        int idx = 0; 
        for(int i=0 ; i<a.length ; i++) {
            if(a[i] == p[idx]) {
                score++; 
            }
            idx++; 
            if(idx == p.length) {
                idx = 0; 
            }
        }
        return score; 
    }
    
    public List<Integer> getArr(int[] a) {
        int[] p1 = {1, 2, 3, 4, 5}; 
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5}; 
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 
        
        int ps1 = getScore(a, p1);
        int ps2 = getScore(a, p2);
        int ps3 = getScore(a, p3);
        
        int max = Math.max(ps1, Math.max(ps2, ps3));
        
        List<Integer> arr = new ArrayList<>(); 
        
        if(ps1 == max) {
            arr.add(1); 
        }
        if(ps2 == max) {
            arr.add(2); 
        }
        if(ps3 == max) {
            arr.add(3); 
        }
        
        return arr; 
    }
    
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = getArr(answers);
        return answer;
    }
}