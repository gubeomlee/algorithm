import java.util.*; 

class Solution {
    public int getNum(int d, int[] rocks, int n) {
        Arrays.sort(rocks);
        
        int[] arr = new int[rocks.length + 1];
        arr[0] = rocks[0]; 
        arr[arr.length - 1] = d - rocks[rocks.length - 1]; 
        
        for(int i=1 ; i <arr.length - 1 ; i++) {
            arr[i] = rocks[i] - rocks[i - 1]; 
        }
        
        int l = 0; 
        int r = d + 1; 
        
        while(l < r) {
            int mid = (l + r) / 2; 
            
            int cur = 0; 
            int cnt = 0; 
            for(int i=0 ; i<arr.length ; i++) {
                cur += arr[i]; 
                if(cur < mid) {
                    cnt++; 
                } else {
                    cur = 0; 
                }
            }
            
            if(cnt <= n) {
                l = mid + 1; 
            } else {
                r = mid; 
            }
        }
        return l - 1; 
    }
    
    public int solution(int distance, int[] rocks, int n) {
        int answer = getNum(distance, rocks, n);
        return answer;
    }
}