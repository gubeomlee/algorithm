class Solution {
    public String getStr(String str, int[] indices) {
        StringBuilder sb = new StringBuilder(); 
        loop: for(int i=0 ; i<str.length() ; i++) {
            for(int j=0 ; j<indices.length ; j++) {
                if(indices[j] == i) {
                    continue loop;       
                }
            }
            sb.append(str.charAt(i));
        }
        return sb.toString(); 
    }
    
    public String solution(String my_string, int[] indices) {
        String answer = getStr(my_string, indices);
        return answer;
    }
}