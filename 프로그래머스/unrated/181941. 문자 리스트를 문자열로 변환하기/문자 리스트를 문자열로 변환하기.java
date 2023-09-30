class Solution {
    public String getStr(String[] arr) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<arr.length ; i++) {
            sb.append(arr[i]); 
        }
        return sb.toString(); 
    }
    public String solution(String[] arr) {
        String answer = getStr(arr);
        return answer;
    }
}