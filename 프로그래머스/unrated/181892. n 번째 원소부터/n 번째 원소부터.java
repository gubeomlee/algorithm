class Solution {
    public int[] getArr(int[] list, int n) {
        int[] arr = new int[list.length - n + 1]; 
        for(int i=n ; i<=list.length; i++) {
            arr[i - n] = list[i - 1]; 
        }
        return arr; 
    }
    
    public int[] solution(int[] num_list, int n) {
        int[] answer = getArr(num_list, n);
        return answer;
    }
}