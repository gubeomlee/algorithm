class Solution {
    public int getSum(int[] a, boolean[] s) {
        int sum = 0; 
        for(int i=0 ; i<a.length ; i++) {
            int num = a[i]; 
            if(!s[i]){
                num *= -1; 
            }
            sum += num; 
        }
        return sum; 
    }
    
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = getSum(absolutes, signs);
        return answer;
    }
}