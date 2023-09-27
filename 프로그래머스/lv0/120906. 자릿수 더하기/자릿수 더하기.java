class Solution {
    public int getSum(int n) {
        int sum = 0; 
        
        String str = Integer.toString(n); 
        for(int i=0 ; i<str.length() ; i++) {
            sum += str.charAt(i) - '0'; 
        }
        
        return sum; 
    } 
    
    public int solution(int n) {
        int answer = getSum(n);
        return answer;
    }
}