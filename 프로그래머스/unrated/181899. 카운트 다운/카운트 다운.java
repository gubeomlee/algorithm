class Solution {
    public int[] getArr(int start, int end) {
        int[] arr = new int[start - end + 1]; 
        int num = start; 
        for(int i=0 ; i<start - end + 1 ; i++) {
            arr[i] = num--; 
        }
        
        return arr; 
    }
    
    public int[] solution(int start, int end) {
        int[] answer = getArr(start, end);
        return answer;
    }
}