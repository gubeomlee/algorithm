class Solution {
    public int[] getArr(int[] arr, int[][] queries) {
        int[] result = new int[queries.length]; 
        for(int i=0 ; i<queries.length ; i++) {
            int min = Integer.MAX_VALUE; 
            for(int j=queries[i][0] ; j<=queries[i][1] ; j++) {
                if(arr[j] > queries[i][2] && arr[j] < min) {
                    min = arr[j]; 
                }
            }
            if(min == Integer.MAX_VALUE) {
                result[i] = -1; 
            } else {
                result[i] = min; 
            }
        }
        return result; 
    }
    
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = getArr(arr, queries);
        return answer;
    }
}