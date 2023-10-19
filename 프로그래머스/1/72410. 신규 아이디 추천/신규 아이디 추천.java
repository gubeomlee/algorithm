class Solution {
    public String getStr(String n) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true; 
        for(int i=0 ; i<n.length() ; i++) {
            if('a' <= n.charAt(i) && n.charAt(i) <= 'z' || '0' <= n.charAt(i) && n.charAt(i) <= '9' || n.charAt(i) == '-' || n.charAt(i) == '_') {
                sb.append(Character.toString(n.charAt(i)));
                flag = true; 
            } else if('A' <= n.charAt(i) && n.charAt(i) <= 'Z') {
                sb.append(Character.toString(n.charAt(i) - 'A' + 'a')); 
                flag = true; 
            } else if(sb.toString().length() != 0 && n.charAt(i) == '.' && flag) {
                flag = false;
                sb.append(Character.toString(n.charAt(i)));
            }
        }
        
        String result = sb.toString(); 
        if(result.length() > 15) {
            result = result.substring(0, 15); 
        } else if(result.length() == 0) {
            result = "a"; 
        }
        while(result.charAt(result.length() - 1) == '.') {
            result = result.substring(0, result.length() - 1); 
        }
        while(result.length() < 3) {
            sb = new StringBuilder(); 
            sb.append(result); 
            sb.append(result.charAt(result.length() - 1)); 
            result = sb.toString(); 
        }
        
        return result; 
    }
    
    public String solution(String new_id) {
        String answer = getStr(new_id);
        return answer;
    }
}