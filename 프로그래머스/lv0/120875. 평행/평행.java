import java.util.*; 

class Solution {        
    public int getNum(int[][] dots) {
        int[][] matrix = {{0,1,2,3},
                          {0,2,1,3},
                          {0,3,1,2}};
        for(int i=0 ; i<3; i++) {
            if(((double) dots[matrix[i][0]][1] - (double) dots[matrix[i][1]][1]) / ((double)dots[matrix[i][0]][0] - (double) dots[matrix[i][1]][0]) == ((double) dots[matrix[i][2]][1] - (double) dots[matrix[i][3]][1]) / ((double) dots[matrix[i][2]][0] - (double) dots[matrix[i][3]][0])) {
                return 1; 
            }
        }
        
        return 0; 
    }
    
    public int solution(int[][] dots) {
        int answer = getNum(dots); 
        return answer;
    }
}