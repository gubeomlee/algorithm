class Solution {
    public int[] getArr(int[] arr, int[][] queries) {
        for(int i=0 ; i<queries.length ; i++) {
            int temp = arr[queries[i][0]]; 
            arr[queries[i][0]] = arr[queries[i][1]]; 
            arr[queries[i][1]] = temp; 
        }
        return arr; 
    }
    
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = getArr(arr, queries);
        return answer;
    }
}