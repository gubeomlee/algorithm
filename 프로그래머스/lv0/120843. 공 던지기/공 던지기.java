class Solution {
    public int getNum(int[] nums, int k) {
        int idx = 1;
        for(int i=0 ; i<k ; i++) {
            if(idx + 2 < nums.length) {
                idx += 2; 
            } else {
                idx = idx + 2 - nums.length; 
            }
        }
        if(idx - 2 > 0) {
            return idx - 2; 
        }
        return idx - 2 + nums.length; 
    }
    
    public int solution(int[] numbers, int k) {
        int answer = getNum(numbers, k);
        return answer;
    }
}