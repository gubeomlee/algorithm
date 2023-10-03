class Solution {
    public int getCnt(int[] arr) {
        int cnt = 0; 
        for(int i=0 ; i<arr.length ; i++) {
            String num = Integer.toString(arr[i]); 
            for(int j=0 ; j<num.length() ; j++) {
                if(num.charAt(j) == '7') {
                    cnt++; 
                }
            }
        }
        return cnt; 
    }
    
    public int solution(int[] array) {
        int answer = getCnt(array);
        return answer;
    }
}