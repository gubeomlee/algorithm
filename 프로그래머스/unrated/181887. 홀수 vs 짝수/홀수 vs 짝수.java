class Solution {
    public int getSum(int[] list) {
        int sum1 = 0; 
        int sum2 = 0; 
        for(int i=0; i<list.length; i++) {
            if(i % 2 == 0) {
                sum1 += list[i]; 
            } else {
                sum2 += list[i]; 
            }
        }
        
        return Math.max(sum1, sum2); 
    }
    
    public int solution(int[] num_list) {
        int answer = getSum(num_list);
        return answer;
    }
}