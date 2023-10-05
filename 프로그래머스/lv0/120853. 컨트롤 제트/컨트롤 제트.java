class Solution {
    public int getSum(String s) {
        String[] arr = s.split(" "); 
        
        int sum = 0;
        int temp = 0; 
        for(int i=0 ; i<arr.length ; i++) {
            if(!arr[i].equals("Z")) {
                sum += Integer.parseInt(arr[i]); 
                temp = Integer.parseInt(arr[i]); 
            } else {
                sum -= temp; 
            }
             
        }
        
        return sum;  
    }
    
    public int solution(String s) {
        int answer = getSum(s);
        return answer;
    }
}