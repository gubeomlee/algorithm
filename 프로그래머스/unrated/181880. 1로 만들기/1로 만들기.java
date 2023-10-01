class Solution {
    public int getCnt(int n) {
        int cnt = 0;
        while(true) {
            if(n == 1) {
                break; 
            } else if(n % 2 == 0) {
                n /= 2; 
            } else {
                n = (n - 1) / 2; 
            }
            cnt++; 
        }
        return cnt; 
    }
    
    public int getNum(int[] arr) {
        int cnt = 0; 
        for(int i=0 ; i<arr.length ; i++) {
            cnt += getCnt(arr[i]);
        }
        return cnt; 
    }
    
    public int solution(int[] num_list) {
        int answer = getNum(num_list);
        return answer;
    }
}