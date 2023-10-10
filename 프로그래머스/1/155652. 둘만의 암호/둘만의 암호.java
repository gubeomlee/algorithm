class Solution {
    public String getStr(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<s.length() ; i++) {
            int temp = 0;
            char c = s.charAt(i); 
            while(temp < index) {
                c = (char) (c + 1);
                if(c > 'z') {
                    c = 'a'; 
                }
                if(!skip.contains(String.valueOf(c))) { 
                    temp++;
                }
            }
            sb.append(c); 
        }
        
        return sb.toString(); 
    }
    
    public String solution(String s, String skip, int index) {
        String answer = getStr(s, skip, index);
        return answer;
    }
}