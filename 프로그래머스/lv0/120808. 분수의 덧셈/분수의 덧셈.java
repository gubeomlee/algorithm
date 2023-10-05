class Solution {
    public int[] getSum(int n1, int d1, int n2, int d2) {
        int[] sum = new int[2]; 
        sum[0] = n1 * d2 + n2 * d1; 
        sum[1] = d1 * d2;
        int n = 2; 
        while(n <= sum[1]) {
            if(sum[0] % n == 0 && sum[1] % n == 0) {
                sum[0] /= n; 
                sum[1] /= n; 
            } else {
                n++; 
            }
        }
        return sum; 
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = getSum(numer1, denom1, numer2, denom2);
        return answer;
    }
}