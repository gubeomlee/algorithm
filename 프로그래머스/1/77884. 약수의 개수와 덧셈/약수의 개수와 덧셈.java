class Solution {
    public int getSum(int l, int r) {
        int sum = 0; 
        
        for(int i=l ; i<=r ; i++) {
            int cnt = 0; 
            for(int j=1 ; j<=i ; j++) {
                if(i % j == 0) {
                    cnt++; 
                }
            }          
            if(cnt % 2 == 0) {
                sum += i; 
            } else {
                sum -= i; 
            }
        }
        return sum; 
    }
    
    public int solution(int left, int right) {
        int answer = getSum(left, right);
        return answer;
    }
}