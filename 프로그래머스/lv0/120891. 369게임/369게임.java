class Solution {
    public int getCnt(int num) {
        int cnt = 0;
        String str = Integer.toString(num); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
                cnt++; 
            }
        }
        return cnt; 
    }
    
    public int solution(int order) {
        int answer = getCnt(order);
        return answer;
    }
}