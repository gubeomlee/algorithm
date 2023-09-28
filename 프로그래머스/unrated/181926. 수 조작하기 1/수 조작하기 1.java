class Solution {
    public int getNum(int n, String con) {
        for(int i=0 ; i<con.length() ; i++) {
            if(con.charAt(i) == 'w') {
                n++; 
            } else if(con.charAt(i) == 's') {
                n--; 
            } else if(con.charAt(i) == 'd') {
                n += 10; 
            } else if(con.charAt(i) == 'a') {
                n -= 10; 
            }
        }
        
        return n; 
    }
    
    public int solution(int n, String control) {
        int answer = getNum(n, control);
        return answer;
    }
}