class Solution {
    public int getSum(int a, int d, boolean[] check) {
        int sum = 0; 
        for(int i=0 ; i<check.length ; i++) {
            if(check[i]) {
                sum += a + d * i; 
            }
        }
        return sum; 
    }
    
    public int solution(int a, int d, boolean[] included) {
        int answer = getSum(a, d, included);
        return answer;
    }
}