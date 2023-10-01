class Solution {
    public String getStr(int[] arr) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<arr.length-1 ; i++) {
            if(arr[i + 1] - arr[i] == 1) {
                sb.append("w");
            } else if(arr[i + 1] - arr[i] == -1) {
                sb.append("s");
            } else if(arr[i + 1] - arr[i] == 10) {
                sb.append("d");
            } else {
                sb.append("a");
            }
        }
        return sb.toString(); 
    }
    
    public String solution(int[] numLog) {
        String answer = getStr(numLog); 
        return answer;
    }
}