class Solution {
    public int getInt(String str, String pat) {
        loop :for(int i=0 ; i<=str.length() - pat.length() ; i++) {
            for(int j=0 ; j<pat.length() ; j++) {
                int strChar = Character.toLowerCase(str.charAt(i + j));
                int patChar = Character.toLowerCase(pat.charAt(j)); 
                if( strChar != patChar) {
                    continue loop; 
                }
            }
            return 1; 
        }
        return 0; 
    }
    
    public int solution(String myString, String pat) {
        int answer = getInt(myString, pat);
        return answer;
    }
}