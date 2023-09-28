class Solution {
    public int[] getArr(int[] list, int n) {
        int[] arr = new int[(list.length - 1) / n + 1]; 
        for(int i=0; i<arr.length ; i++) {
            arr[i] = list[i * n]; 
        }
        return arr; 
    }
    
    public int[] solution(int[] num_list, int n) {
        int[] answer = getArr(num_list, n);
        return answer;
    }
}