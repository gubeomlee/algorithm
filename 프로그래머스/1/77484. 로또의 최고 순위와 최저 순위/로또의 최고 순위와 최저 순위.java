class Solution {
    public int[] getArr(int[] l, int[] w) {
        int cnt = 0; 
        int cntZero = 0; 
        for(int i=0 ; i<l.length ; i++) {
            if(l[i] == 0) {
                cntZero++; 
            } else {
                for(int j=0 ; j<w.length ; j++) {
                    if(w[j] == l[i]) {
                        cnt++; 
                    }
                }
            }
        }
        return new int[] {Math.min(7 - cnt - cntZero, 6), Math.min(7 - cnt, 6)}; 
    }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = getArr(lottos, win_nums);
        return answer;
    }
}