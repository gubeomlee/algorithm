class Solution {
    public int isPart(String str, String target) {
        loop: for(int i=0 ; i<=str.length() - target.length() ; i++) {
            for(int j=0 ; j<target.length() ; j++) {
                if(str.charAt(i + j) != target.charAt(j)) {
                    continue loop;  
                }
            }
            return 1; 
        }
        return 0; 
    }
    
    public int solution(String my_string, String target) {
        int answer = isPart(my_string, target);
        return answer;
    }
}