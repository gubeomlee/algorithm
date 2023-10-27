import java.util.*; 

class Solution {
    public int[] getArr(int[] s, int k) {
        if(s[0] == k) {
            return new int[] {0, 0}; 
        }
        
        int[] result = new int[s.length];
        int temp = 0; 
        int idx = s.length - 1; 
        for(int i=s.length - 1 ; i>=0 ; i--) {
            temp += s[i]; 
            if(temp > k) {
                temp -= s[idx]; 
                idx--; 
            }
            if(temp == k) {
                result[i] = idx; 
            }
        }
        int len = Integer.MAX_VALUE;
        int index = 0; 
        for(int i=0 ; i<result.length ; i++) {
            if(result[i] != 0 && result[i] - i < len) {
                len = result[i] - i; 
                index = i; 
            }
        }

        return new int[] {index, result[index]}; 
    }
    
    public int[] solution(int[] sequence, int k) {
        int[] answer = getArr(sequence, k);
        return answer;
    }
}