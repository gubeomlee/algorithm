import java.util.*;

class Solution {
    public int isValid(int[] sides) {
        Arrays.sort(sides); 
        if(sides[0] + sides[1] > sides[2]) {
            return 1; 
        } else {
            return 2; 
        }
    }
    
    public int solution(int[] sides) {
        int answer = isValid(sides);
        return answer;
    }
}