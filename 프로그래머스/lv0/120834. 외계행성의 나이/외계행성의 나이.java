class Solution {
    public String getAge(int age) {
        StringBuilder sb = new StringBuilder(); 
        String str = Integer.toString(age); 
        for(int i=0 ; i<str.length() ; i++) {
            sb.append((char) (str.charAt(i) - '0' + 'a')); 
        }
        return sb.toString(); 
    }
    
    public String solution(int age) {
        String answer = getAge(age);
        return answer;
    }
}