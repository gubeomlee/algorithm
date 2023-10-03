import java.util.*; 

class Solution {
    public int getNum(String str1, String str2) {
        char[] char1 = str1.toCharArray(); 
        char[] char2 = str2.toCharArray(); 
        
        Arrays.sort(char1); 
        Arrays.sort(char2); 
        
        for(int i=0 ; i<char1.length ; i++) {
            if(char1[i] != char2[i]) {
                return 0; 
            }
        }
        
        return 1; 
    }
    
    public int solution(String before, String after) {
        int answer = getNum(before, after);
        return answer;
    }
}