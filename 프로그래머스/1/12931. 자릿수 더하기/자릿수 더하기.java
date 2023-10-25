import java.util.*;

public class Solution {
    public int getArr(int n) {
        String str = Integer.toString(n); 
        int sum = 0;
        for(int i=0 ; i<str.length() ; i++) {
            sum += str.charAt(i) - '0'; 
        }
        
        return sum; 
    }
    public int solution(int n) {
        int answer = getArr(n);
        return answer;
    }
}