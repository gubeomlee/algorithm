class Solution {
    public int getNum(int[] arr, int n) {
        int num = Integer.MAX_VALUE; 
        for(int i=0 ; i<arr.length ; i++) {
            if(Math.abs(n - arr[i]) < Math.abs(n - num)) {
                num = arr[i]; 
            } else if (Math.abs(n - arr[i]) == Math.abs(n - num)) {
                num = Math.min(num, arr[i]); 
            }
        }
        return num; 
    }
    
    public int solution(int[] array, int n) {
        int answer = getNum(array, n);
        return answer;
    }
}