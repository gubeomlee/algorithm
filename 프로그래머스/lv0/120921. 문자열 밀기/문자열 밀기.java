class Solution {
    public int getNum(String A, String B) {        
        loop: for(int i=0 ; i<A.length() ; i++) {
            for(int j=0 ; j<A.length() ; j++) {
                if(i + j < A.length()) {
                    if(A.charAt(j) != B.charAt(i + j)) {
                        continue loop;           
                    }
                } else {
                    if(A.charAt(j) != B.charAt(i + j - A.length())) {
                        continue loop; 
                    }
                }
            }
            return i; 
        }
        return -1; 
    }
    
    public int solution(String A, String B) {
        int answer = getNum(A, B);
        return answer;
    }
}