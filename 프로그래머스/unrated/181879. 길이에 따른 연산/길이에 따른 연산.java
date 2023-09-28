class Solution {
    public int getNum(int[] list) {
        int sum1 = 0;
        int sum2 = 1; 
        int len = list.length; 
        for(int i=0 ; i<len ; i++) {
            if(len > 10) {
                sum1 += list[i]; 
            } else {
                sum2 *= list[i]; 
            }
        }
        return Math.max(sum1, sum2); 
    }
    
    public int solution(int[] num_list) {
        int answer = getNum(num_list);
        return answer;
    }
}