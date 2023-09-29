class Solution {
    public int[] getArr(int[] list, int n) {
        int[] arr = new int[list.length];
        for(int i=0 ; i<list.length - n ; i++) {
            arr[i] = list[n + i];
        }
        
        for(int i=list.length - n ; i<list.length ; i++) {
            arr[i] = list[i - list.length + n]; 
        }
        
        return arr; 
    }
    
    public int[] solution(int[] num_list, int n) {
        int[] answer = getArr(num_list, n);
        return answer;
    }
}