class Solution {
    public String getStr(String str) {
        int[] arr = new int[26];
        for(int i=0 ; i<str.length() ; i++) {
            arr[str.charAt(i) - 'a']++; 
        }
        
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] == 1) {
                sb.append((char) ('a' + i)); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String s) {
        String answer = getStr(s); 
        return answer;
    }
}