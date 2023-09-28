class Solution {
    public int getSum(String str) {
        int sum = 0; 
        for(int i=0 ; i<str.length() ; i++) {
            sum += str.charAt(i) - '0'; 
        }
        return sum; 
    } 
    
    public int solution(String num_str) {
        int answer = getSum(num_str);
        return answer;
    }
}