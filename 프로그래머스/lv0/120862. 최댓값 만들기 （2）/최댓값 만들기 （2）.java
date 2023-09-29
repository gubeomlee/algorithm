import java.util.*; 

class Solution {
    public int getMax(int[] nums) {
        Arrays.sort(nums); 
        int len = nums.length; 
        return Math.max(nums[0] * nums[1], nums[len - 2] * nums[len - 1]);
    }
    
    public int solution(int[] numbers) {
        int answer = getMax(numbers);
        return answer;
    }
}