class Solution {
    public int getIdx(int[] arr, int idx) {
        for(int i=idx ; i<arr.length ; i++) {
            if(arr[i] == 1) {
                return i; 
            }
        }
        return -1; 
    }
    
    public int solution(int[] arr, int idx) {
        int answer = getIdx(arr, idx);
        return answer;
    }
}