class Solution {
    public int getCnt(int n) {
        int cnt = 0; 
        while(true) {
            if(n >= 50 && n % 2 == 0) {
                n /= 2; 
            } else if(n < 50 && n % 2 == 1) {
                n = n * 2 + 1; 
            } else {
                break; 
            }
            cnt++; 
        }
        return cnt; 
    }
    
    public int getNum(int[] arr) {
        int cnt = 0; 
        for(int i=0 ; i<arr.length ; i++) {
            cnt = Math.max(cnt, getCnt(arr[i])); 
        }
        return cnt; 
    }
    
    public int solution(int[] arr) {
        int answer = getNum(arr);
        return answer;
    }
}