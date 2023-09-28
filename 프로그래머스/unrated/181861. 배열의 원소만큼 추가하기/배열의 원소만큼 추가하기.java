class Solution {
    public int[] getArr(int[] arr) {
        int sum = 0; 
        for(int i=0 ; i<arr.length ; i++) {
            sum += arr[i]; 
        }
        
        int[] result = new int[sum]; 
        int idx = 0; 
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=0 ; j<arr[i] ; j++) {
                result[idx++] = arr[i]; 
            }
        }
        
        return result; 
    }
    
    public int[] solution(int[] arr) {
        int[] answer = getArr(arr);
        return answer;
    }
}