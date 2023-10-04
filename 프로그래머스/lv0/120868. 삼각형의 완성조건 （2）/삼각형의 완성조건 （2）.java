class Solution {
    public int getCnt(int[] sides) {
        int min = Math.min(sides[0], sides[1]); 
      
        return 2 * min - 1; 
    }
    
    public int solution(int[] sides) {
        int answer = getCnt(sides);
        return answer;
    }
}