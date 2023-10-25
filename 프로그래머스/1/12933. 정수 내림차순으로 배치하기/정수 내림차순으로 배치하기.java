import java.util.*; 

class Solution {
    public long getNum(long n) {
        char[] arr = Long.toString(n).toCharArray();
        Arrays.sort(arr); 
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1 ; i>=0 ; i--) {
            sb.append(arr[i]); 
        }
        
        return Long.parseLong(sb.toString()); 
    }
    
    public long solution(long n) {
        long answer = getNum(n);
        return answer;
    }
}