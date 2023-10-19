class Solution {
    public int getNum(int n) {
        StringBuilder sb = new StringBuilder(); 
        while(n > 0) {
            sb.append(Integer.toString(n % 3));
            n /= 3; 
        }

        String str = sb.toString(); 
        int num = 0; 
        for(int i=0 ; i<str.length() ; i++) {
            num += (str.charAt(i) - '0') * Math.pow(3, str.length() - 1 - i); 
        }
        return num; 
    }
    
    public int solution(int n) {
        int answer = getNum(n);
        return answer;
    }
}