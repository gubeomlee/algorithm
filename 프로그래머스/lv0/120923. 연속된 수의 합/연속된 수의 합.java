class Solution {
    public int[] getArr(int num, int t) {
        int[] arr = new int[num]; 
        arr[0] = (t * 2 / num - num + 1) / 2; 
        for(int i=1 ; i<num ; i++) {
            arr[i] = arr[i - 1] + 1; 
        }
        return arr; 
    }
    
    public int[] solution(int num, int total) {
        int[] answer = getArr(num, total);
        return answer;
    }
}