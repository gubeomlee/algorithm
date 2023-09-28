class Solution {
    public int[] getArr(int n, int k) {
        int[] arr = new int[n/k];
        arr[0] = k; 
        for(int i=1 ; i<n/k ; i++) {
            arr[i] = arr[i - 1] + k;  
        }
        return arr; 
    }
    
    public int[] solution(int n, int k) {
        int[] answer = getArr(n, k);
        return answer;
    }
}