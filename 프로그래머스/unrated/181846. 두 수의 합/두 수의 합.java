class Solution {
    public String getSum(String a, String b) {
        int[] arr = new int[Math.max(a.length(), b.length()) + 1]; 
        
        int idx = arr.length - 1; 
        for(int i=a.length() - 1 ; i>=0 ; i--) {
            arr[idx--] += a.charAt(i) - '0'; 
        }
        idx = arr.length - 1; 
        for(int i=b.length() - 1 ; i>=0 ; i--) {
            arr[idx--] += b.charAt(i) - '0'; 
        }
        
        for(int i=arr.length-1 ; i>=0 ; i--) {
            if(arr[i] >= 10) {
                arr[i] -= 10; 
                arr[i - 1] += 1; 
            }
        }
        
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<arr.length ; i++) {
            if(i == 0 && arr[i] == 0) {
            } else {
                sb.append(arr[i]);    
            }
             
        }
        
        return sb.toString(); 
    }
    
    public String solution(String a, String b) {
        String answer = getSum(a, b);
        return answer;
    }
}