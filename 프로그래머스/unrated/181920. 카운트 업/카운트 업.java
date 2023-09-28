class Solution {
    public int[] getArr(int start, int end) {
        int[] arr = new int[end - start + 1]; 
        for(int i=start ; i<=end ; i++) {
            arr[i - start] = i; 
        }
        
        return arr; 
    }
    
    public int[] solution(int start_num, int end_num) {
        int[] answer = getArr(start_num, end_num);
        return answer;
    }
}