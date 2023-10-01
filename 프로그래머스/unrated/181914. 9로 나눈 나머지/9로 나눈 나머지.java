class Solution {
    public int getSum(String num) {
        int sum = 0; 
        for(int i=0 ; i<num.length() ; i++) {
            sum += num.charAt(i) - '0'; 
        }
        
        return sum % 9; 
    }
     
    public int solution(String number) {
        int answer = getSum(number);
        return answer;
    }
}