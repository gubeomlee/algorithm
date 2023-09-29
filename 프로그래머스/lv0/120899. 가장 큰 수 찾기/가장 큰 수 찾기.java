class Solution {
    public int[] getArr(int[] arr) {
        int[] result = new int[2]; 
        result[0] = Integer.MIN_VALUE; 
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] > result[0]) {
                result[0] = arr[i];
                result[1] = i;  
            }
        }
        return result; 
    }
    
    public int[] solution(int[] array) {
        int[] answer = getArr(array);
        return answer;
    }
}