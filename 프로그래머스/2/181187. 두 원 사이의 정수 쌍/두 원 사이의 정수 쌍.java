class Solution {
    public long getCnt(int r1, int r2) {
        long cnt = (r2 - r1 + 1) * 4; 
        for(int i=1 ; i<r2 ; i++) {
            int idx1 = (int) Math.sqrt((long) Math.pow(r1, 2) - (long) Math.pow(i, 2));
            int idx2 = (int) Math.sqrt((long) Math.pow(r2, 2) - (long) Math.pow(i, 2));
            cnt += (long) (idx2 - idx1) * 4; 
            
            if(i < r1 && Math.sqrt((long) Math.pow(r1, 2) - (long) Math.pow(i, 2)) % 1 ==0) {
                cnt += 4; 
            }
        }
        return cnt; 
    }
    
    public long solution(int r1, int r2) {
        long answer = getCnt(r1, r2);
        return answer;
    }
}