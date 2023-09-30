class Solution {
    public int getNum(int a, int b) {
        StringBuilder sb = new StringBuilder(); 
        sb.append(a);
        sb.append(b); 
        
        return Math.max(Integer.parseInt(sb.toString()), 2 * a * b); 
    }
    
    public int solution(int a, int b) {
        int answer = getNum(a, b);
        return answer;
    }
}