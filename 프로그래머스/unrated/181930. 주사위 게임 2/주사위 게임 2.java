class Solution {
    public int getNum(int a, int b, int c) {
        int num = 0; 
        if(a == b && b == c && c == a) {
            num = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)); 
        } else if(a == b || b == c || c == a) {
            num = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)); 
        } else {
            num = (a + b + c); 
        }
        return num; 
    }
    
    public int solution(int a, int b, int c) {
        int answer = getNum(a, b, c);
        return answer;
    }
}