class Solution {
    public String getStr(String[] list, String ex) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<list.length ; i++) {
            if(!list[i].contains(ex)) {
                sb.append(list[i]); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String[] str_list, String ex) {
        String answer = getStr(str_list, ex);
        return answer;
    }
}