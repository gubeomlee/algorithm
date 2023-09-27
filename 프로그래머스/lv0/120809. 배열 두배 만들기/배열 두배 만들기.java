class Solution {
    public int[] getArr(int[] nums) {
        int[] arr = new int[nums.length]; 
        for(int i=0 ; i<nums.length ; i++) {
            arr[i] = nums[i] * 2; 
        }
        
        return arr; 
    }
    
    public int[] solution(int[] numbers) {
        int[] answer = getArr(numbers);
        return answer;
    }
}