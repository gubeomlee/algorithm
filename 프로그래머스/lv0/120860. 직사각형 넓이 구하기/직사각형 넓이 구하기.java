class Solution {
    public int getNum(int[][] d) {
        int r = Math.max(Math.max(d[0][0], d[1][0]), Math.max(d[2][0], d[3][0])) - Math.min(Math.min(d[0][0], d[1][0]), Math.min(d[2][0], d[3][0]));
        int c = Math.max(Math.max(d[0][1], d[1][1]), Math.max(d[2][1], d[3][1])) - Math.min(Math.min(d[0][1], d[1][1]), Math.min(d[2][1], d[3][1]));
        
        return r * c; 
    }
    
    public int solution(int[][] dots) {
        int answer = getNum(dots);
        return answer;
    }
}