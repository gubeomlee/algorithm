class Solution {
    public int[] getArr(int[] arr, int[][] queries) {
        for(int i=0 ; i<queries.length ; i++) {
            for(int j=queries[i][0] ; j<=queries[i][1] ; j++) {
                arr[j]++; 
            }
        }
        
        return arr; 
    }
    
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = getArr(arr, queries);
        return answer;
    }
}