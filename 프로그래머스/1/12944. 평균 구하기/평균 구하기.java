class Solution {
    public double getAvg(int[] arr) {
        double sum = 0; 
        for(int i=0 ; i<arr.length ; i++) {
            sum += arr[i]; 
        }
        return sum / arr.length; 
    }
    
    public double solution(int[] arr) {
        double answer = getAvg(arr);
        return answer;
    }
}