class Solution {
    public int getNum(int a, int b) {
        StringBuilder sb = new StringBuilder(); 
        sb.append(Integer.toString(a)); 
        sb.append(Integer.toString(b)); 
        
        return Integer.parseInt(sb.toString()); 
    }
    
    public int solution(int a, int b) {
        int answer = Math.max(getNum(a, b), getNum(b, a));
        return answer;
    }
}