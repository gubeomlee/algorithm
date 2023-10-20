class Solution {
    public void backTrack(int[] arr, int idx, int[] result) {
        int cnt = 0; 
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] != 0) {
                cnt++; 
            }
        }

        result[0] = Math.max(result[0], cnt); 
        
        for(int i=idx ; i<arr.length ; i++) {
            if(arr[i] == 2) {
                if(i > 0 && arr[i - 1] == 0) {
                    arr[i - 1] = 1; 
                    arr[i] = 1; 
                    backTrack(arr, i+1, result); 
                    arr[i - 1] = 0; 
                    arr[i] = 2; 
                } 
                if(i < arr.length - 1 && arr[i + 1] == 0) {
                    arr[i + 1] = 1; 
                    arr[i] = 1; 
                    backTrack(arr, i+1, result); 
                    arr[i + 1] = 0; 
                    arr[i] = 2;
                }
            }
        }
    }
    
    public int getCnt(int n, int[] l, int[] r) {
        int[] arr = new int[n]; 
        for(int i=0 ; i<n ; i++) {
            arr[i] = 1; 
        }
        
        for(int i=0 ; i<l.length ; i++) {
            arr[l[i] - 1] -= 1; 
        }
        
        for(int i=0 ; i<r.length ; i++) {
            arr[r[i] - 1] += 1; 
        }
        
        int[] result = {0}; 
        backTrack(arr, 0, result); 
        
        return result[0]; 
    }
    
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = getCnt(n, lost, reserve);
        return answer;
    }
}