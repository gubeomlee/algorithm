class Solution {
    public int[] getArr(int[] arr, int k) {
        for(int i=0 ; i<arr.length ; i++) {
            if(k % 2 == 0) {
                arr[i] = arr[i] + k; 
            } else {
                arr[i] = arr[i] * k; 
            } 
        }
        
        return arr; 
    }
    
    public int[] solution(int[] arr, int k) {
        int[] answer = getArr(arr, k);
        return answer;
    }
}