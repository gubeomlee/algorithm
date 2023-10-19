class Solution {
    public int getSum(int[] a, int[] b) {
        int sum = 0; 
        for(int i=0 ; i<a.length ; i++) {
            sum += a[i] * b[i]; 
        }
        return sum; 
    }
    
    public int solution(int[] a, int[] b) {
        int answer = getSum(a, b);
        return answer;
    }
}