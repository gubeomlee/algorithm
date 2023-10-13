class Solution {
    public int getDiv(boolean[] arr, int num) {
        int cnt = 1;
        int idx = 2;
        int temp = 1; 
        while(num > 1) {
            if(arr[idx]) {
                idx++; 
            } else if(num % idx == 0) {
                num /= idx; 
                temp++; 
            } else if(num % idx != 0) {
                cnt *= temp; 
                temp = 1; 
                idx++; 
            }
        }
        return cnt * temp; 
    }
    
    public int getSum(int n, int l, int p) {
        boolean[] arr = new boolean[n + 1]; 
        for(int i=2 ; i<=n ; i++) {
            for(int j=i*2 ; j<=n ; j+=i) {
                arr[j] = true; 
            }
        }
        
        int sum = 0; 
        for(int i=1 ; i<=n ; i++) {
            int div = getDiv(arr, i); 
            if(div > l) {
                sum += p; 
            } else {
                sum += div; 
            }
        }
        return sum;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = getSum(number, limit, power);
        return answer;
    }
}