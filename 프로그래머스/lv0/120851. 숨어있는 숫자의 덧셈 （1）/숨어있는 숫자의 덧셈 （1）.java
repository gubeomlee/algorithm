class Solution {
    public int getSum(String str) {
        int sum = 0; 
        for(int i=0 ; i<str.length() ; i++) {
            if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                sum += str.charAt(i) - '0'; 
            }
        }
        
        return sum; 
    }
    
    public int solution(String my_string) {
        int answer = getSum(my_string);
        return answer;
    }
}