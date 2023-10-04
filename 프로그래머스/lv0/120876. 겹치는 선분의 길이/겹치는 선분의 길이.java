class Solution {
    public int getLen(int[][] lines) {
        int[] check = new int[201]; 
        for(int i=0 ; i<3 ; i++) {
            for(int j=lines[i][0]+100 ; j<lines[i][1]+100 ; j++) {
                check[j]++; 
            }
        }
        
        int cnt = 0; 
        for(int i=0 ; i<201 ; i++) {
            if(check[i] > 1) {
                cnt++; 
            }
        }
        return cnt; 
    }
    
    public int solution(int[][] lines) {
        int answer = getLen(lines);
        return answer;
    }
}