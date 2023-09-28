class Solution {
    public int[] getArr(int[] list) {
        int len = list.length; 
        int[] arr = new int[len + 1];
        for(int i=0 ; i<len ; i++) {
            arr[i] = list[i]; 
        }
        
        if(arr[len - 1] > arr[len - 2]) {
            arr[len] = arr[len - 1] - arr[len - 2]; 
        } else {
            arr[len] = arr[len - 1] * 2;
        }
        
        return arr; 
    }
    
    public int[] solution(int[] num_list) {
        int[] answer = getArr(num_list);
        return answer;
    }
}