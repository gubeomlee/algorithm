class Solution {
    public String getStr(String str, int[][] queries) {
        char[] arr = str.toCharArray(); 
        for(int i=0 ; i<queries.length ; i++) {
            for(int j=0 ; j<(queries[i][1] - queries[i][0])/2 + 1 ; j++) {
                char temp = arr[queries[i][0] + j];
                arr[queries[i][0] + j] = arr[queries[i][1] - j];
                arr[queries[i][1] - j] = temp; 
            }
        }
        
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<arr.length ; i++) {
            sb.append(arr[i]); 
        }
        
        return sb.toString(); 
    }
    
    public String solution(String my_string, int[][] queries) {
        String answer = getStr(my_string, queries);
        return answer;
    }
}