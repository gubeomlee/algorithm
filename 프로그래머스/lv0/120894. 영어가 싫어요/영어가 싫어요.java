class Solution {
    public long getNum(String str) {
        StringBuilder sb = new StringBuilder();
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
        loop1: for(int i=0 ; i<str.length() ;) {
            loop2: for(int j=0 ; j<nums.length ; j++) {   
                for(int k=0 ; k<nums[j].length() ; k++) {
                       if(str.charAt(i + k) != nums[j].charAt(k)) {
                           continue loop2; 
                       }
                   }
                i += nums[j].length(); 
                sb.append(j); 
                continue loop1;
            }
        }
        return Long.parseLong(sb.toString()); 
    }
    
    public long solution(String numbers) {
        long answer = getNum(numbers);
        return answer;
    }
}