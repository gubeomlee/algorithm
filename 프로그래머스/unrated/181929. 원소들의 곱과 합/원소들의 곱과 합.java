class Solution {
    public int sumAndMul(int[] list) {
        int sum = 0;
        int mul = 1; 
        for(int i=0 ; i<list.length ; i++) {
            sum += list[i]; 
            mul *= list[i]; 
        }
        
        if(mul < sum * sum) {
            return 1; 
        } 
        return 0; 
    }
    
    public int solution(int[] num_list) {
        int answer = sumAndMul(num_list);
        return answer;
    }
}