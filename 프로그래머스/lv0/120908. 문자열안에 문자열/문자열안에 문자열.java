class Solution {
    public int find(String str1, String str2) {
        loop: for(int i=0 ; i<=str1.length() - str2.length() ; i++) {
            for(int j=0 ; j<str2.length() ; j++) {
                if(str1.charAt(i + j) != str2.charAt(j)) {
                    continue loop;       
                }
            }
            return 1; 
        }
        return 2; 
    }
    
    public int solution(String str1, String str2) {
        int answer = find(str1, str2);
        return answer;
    }
}