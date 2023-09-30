class Solution {
    public String getStr(String str, int num1, int num2) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(i == num1) {
                sb.append(str.charAt(num2)); 
            } else if(i == num2) {
                sb.append(str.charAt(num1));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString(); 
    }
    
    public String solution(String my_string, int num1, int num2) {
        String answer = getStr(my_string, num1, num2);
        return answer;
    }
}