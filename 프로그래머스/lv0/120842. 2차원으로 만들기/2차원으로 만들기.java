class Solution {
    public int[][] getM(int[] list, int n) {
        int[][] matrix = new int[list.length / n][n];
        for(int i=0 ; i<list.length ; i++) {
            matrix[i/n][i%n] = list[i]; 
        }
        
        return matrix; 
    }
    
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = getM(num_list, n);
        return answer;
    }
}