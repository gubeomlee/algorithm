class Solution {
    public void backTrack(int[] n, boolean[] check, int idx, int cnt, int[] result) {
        if(cnt == 3) {
            int temp = 0; 
            for(int i=0 ; i<check.length ; i++) {
                if(check[i]) {
                    temp += n[i]; 
                }
            }
            if(temp == 0) {
                result[0] += 1; 
            }
        } else {
            for(int i=idx ; i<n.length ; i++) {
                check[i] = true; 
                backTrack(n, check, i+1, cnt+1, result); 
                check[i] = false; 
            }
        }
    }
    
    public int getCnt(int[] n) {
        int[] result = {0}; 
        backTrack(n, new boolean[n.length], 0, 0, result); 
        return result[0]; 
    }
    
    public int solution(int[] number) {
        int answer = getCnt(number);
        return answer;
    }
}