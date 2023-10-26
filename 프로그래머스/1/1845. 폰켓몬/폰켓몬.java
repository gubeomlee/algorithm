import java.util.*; 

class Solution {
    public int getCnt(int[] n) {
        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i<n.length ; i++) {
            set.add(n[i]); 
        }
        
        return Math.min(n.length/2, set.size()); 
    }
    
    public int solution(int[] nums) {
        int answer = getCnt(nums);
        return answer;
    }
}