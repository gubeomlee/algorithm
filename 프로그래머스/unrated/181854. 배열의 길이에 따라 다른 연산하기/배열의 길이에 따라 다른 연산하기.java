class Solution {
    public int[] getArr(int[] arr, int n) {
        int idx = 0; 
        if(arr.length % 2 == 0) {
            idx = 1; 
        }
        
        for(int i=idx ; i<arr.length ; i+=2) {
            arr[i] += n; 
        }
        
        return arr; 
    }
    
    public int[] solution(int[] arr, int n) {
        int[] answer = getArr(arr, n);
        return answer;
    }
}