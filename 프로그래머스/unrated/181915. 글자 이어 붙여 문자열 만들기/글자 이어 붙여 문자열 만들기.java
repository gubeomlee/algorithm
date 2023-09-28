class Solution {
    public String getStr(String str, int[] list) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<list.length ; i++) {
            sb.append(str.charAt(list[i])); 
        }
        
        return sb.toString(); 
    }
    
    public String solution(String my_string, int[] index_list) {
        String answer = getStr(my_string, index_list);
        return answer;
    }
}