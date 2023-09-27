import java.util.*; 

class Solution {
    public int getMid(int[] arr) {
        Arrays.sort(arr); 
        return arr[arr.length / 2];
    }
    
    public int solution(int[] array) {
        int answer = getMid(array);
        return answer;
    }
}