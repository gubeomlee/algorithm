class Solution {
    public long[] getArr(int x, int n) {
        long[] arr = new long[n]; 
        for(int i=1 ; i<=n ; i++) {
            arr[i - 1] = (long) x * i; 
        }
        return arr; 
    }
    
    public long[] solution(int x, int n) {
        long[] answer = getArr(x, n);
        return answer;
    }
}