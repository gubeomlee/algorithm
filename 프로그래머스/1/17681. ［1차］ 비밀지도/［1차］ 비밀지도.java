class Solution {
    public String[] getArr(int n, int[] arr1, int[] arr2) {
        int[][] m1 = new int[n][n]; 
        int[][] m2 = new int[n][n];
        int[][] m = new int[n][n]; 
        
        for(int i=0 ; i<n ; i++) {
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);
            for(int j=0 ; j < str1.length() ; j++) {
                if(str1.charAt(str1.length() - 1 - j) == '1') {
                    m1[i][n - 1 - j] = 1; 
                }
            }
            for(int j=0 ; j < str2.length() ; j++) {
                if(str2.charAt(str2.length() - 1 - j) == '1') {
                    m2[i][n - 1 - j] = 1; 
                }
            }
        }
        
        String[] result = new String[n]; 
        for(int i=0 ; i<n ; i++) {
            StringBuilder sb = new StringBuilder(); 
            for(int j=0 ; j<n ; j++) {
                if(m1[i][j] == 1 || m2[i][j] == 1) {
                    sb.append("#"); 
                } else {
                    sb.append(" "); 
                }
            }
            result[i] = sb.toString(); 
        }
        
        return result; 
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = getArr(n, arr1, arr2);
        return answer;
    }
}