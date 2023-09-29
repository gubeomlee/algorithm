class Solution {
    public int getCnt(int[] box, int n) {
        int cnt = 1; 
        cnt *= box[0] / n;
        cnt *= box[1] / n;
        cnt *= box[2] / n;
        return cnt; 
    }
    
    public int solution(int[] box, int n) {
        int answer = getCnt(box, n);
        return answer;
    }
}