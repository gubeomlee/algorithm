class Solution {
    public boolean isValid(int num) {
        for(int i=2 ; i<Math.sqrt(num) + 1 ; i++) {
            if(num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    
    public void backTrack(int[] n, int idx, int sum, int cnt, int[] result) {
        if(cnt == 3 && isValid(sum)) {
            result[0] += 1;
        } else if(cnt < 3) {
            for(int i=idx ; i<n.length ; i++) {
                backTrack(n, i+1, sum+n[i], cnt+1, result); 
            }
        }
    }
    
    public int getNum(int[] n) {
        int[] result = {0}; 
        backTrack(n, 0, 0, 0, result); 
        return result[0]; 
    }
    
    public int solution(int[] nums) {
        int answer = getNum(nums);
        return answer;
    }
}