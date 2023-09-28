class Solution {
    public int getInt(String str) {
        int num = 0; 
        for(int i=0 ; i<str.length() ; i++) {
            num += (str.charAt(i) - '0') * Math.pow(10, str.length() - 1 - i); 
        }
        return num; 
    }
    
    public int solution(String n_str) {
        int answer = getInt(n_str);
        return answer;
    }
}