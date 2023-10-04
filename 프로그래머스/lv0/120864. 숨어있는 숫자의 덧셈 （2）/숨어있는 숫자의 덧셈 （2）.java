class Solution {
    public int getSum(String my_string) {
        int sum = 0 ;
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<my_string.length() ; i++) {
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                sb.append(my_string.charAt(i)); 
            } else if(sb.toString().length() > 0) {
                sum += Integer.parseInt(sb.toString()); 
                sb = new StringBuilder(); 
            }
        }
        
        if(sb.toString().length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }
        
        return sum; 
    }
    
    public int solution(String my_string) {
        int answer = getSum(my_string);
        return answer;
    }
}