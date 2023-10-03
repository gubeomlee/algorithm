class Solution {
    public int getNum(int num, int c) {
        int cnt = 0; 
        String str = Integer.toString(num); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) - '0' == c) {
                cnt++; 
            }
        }
        return cnt; 
    } 
    
    public int getCnt(int a, int b, int c) {
        int cnt = 0; 
        for(int i=a ; i<=b ; i++) {
            cnt += getNum(i, c); 
        }
        return cnt; 
    }
    
    public int solution(int i, int j, int k) {
        int answer = getCnt(i, j, k);
        return answer;
    }
}