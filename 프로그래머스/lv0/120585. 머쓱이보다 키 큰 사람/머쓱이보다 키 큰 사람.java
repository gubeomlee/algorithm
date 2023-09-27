class Solution {
    public int getRank(int[] arr, int h) {
        int cnt = 0; 
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] > h) {
                cnt++; 
            }
        }        
        
        return cnt; 
    }
    
    public int solution(int[] array, int height) {
        int answer = getRank(array, height);
        return answer;
    }
}