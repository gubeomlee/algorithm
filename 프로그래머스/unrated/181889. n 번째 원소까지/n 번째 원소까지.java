class Solution {
    public int[] getArr(int[] list, int n) {
        int[] arr = new int[n]; 
        for(int i=0 ; i<n ; i++) {
            arr[i] = list[i]; 
        }
        
        return arr; 
    }
    
    public int[] solution(int[] num_list, int n) {
        int[] answer = getArr(num_list, n);
        return answer;
    }
}