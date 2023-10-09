class Solution {
    public int[] getArr(String[] w) {
        int lux = w.length - 1;
        int luy = w[0].length() - 1; 
        int rdx = 0; 
        int rdy = 0; 
        
        for(int i=0 ; i<w.length ; i++) {
            for(int j=0 ; j<w[i].length() ; j++) {
                if(w[i].charAt(j) == '#') {
                    lux = Math.min(lux, i); 
                    luy = Math.min(luy, j); 
                    rdx = Math.max(rdx, i); 
                    rdy = Math.max(rdy, j); 
                }
            }
        }
        
        return new int[] {lux, luy, rdx + 1, rdy + 1}; 
    }
    
    public int[] solution(String[] wallpaper) {
        int[] answer = getArr(wallpaper);
        return answer;
    }
}