class Solution {
    public int isSub(String str1, String str2) {
        loop: for(int i=0 ; i<=str2.length() - str1.length() ; i++) {
            for(int j=0 ; j<str1.length() ; j++) {
                if(str2.charAt(i + j) != str1.charAt(j)) {
                    continue loop; 
                }
            }
            return 1; 
        }
        return 0; 
    }
    
    public int solution(String str1, String str2) {
        int answer = isSub(str1, str2);
        return answer;
    }
}