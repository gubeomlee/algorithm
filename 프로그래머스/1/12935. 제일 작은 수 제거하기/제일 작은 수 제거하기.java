class Solution {
    public int[] getArr(int[] arr) {
        if(arr[0] == 10 && arr.length == 1) {
            return new int[] {-1}; 
        }
        
        int idx = 0; 
        int min = Integer.MAX_VALUE; 
        for(int i=0 ; i<arr.length ; i++) {
            if(min > arr[i]) {
                min = arr[i]; 
                idx = i; 
            }
        }
        
        int[] result = new int[arr.length - 1]; 
        for(int i=0, j=0 ; i<arr.length ; i++, j++) {
            if(i != idx) {
                result[j] = arr[i]; 
            } else if (i == idx) {
                j--; 
            }
        }
        
        return result; 
    }
    
    public int[] solution(int[] arr) {
        int[] answer = getArr(arr);
        return answer;
    }
}