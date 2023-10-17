class Solution {
    public int getSum(int[] n) {
        int sum = 0; 
        loop: for(int i=1 ; i<10 ; i++) {
            for(int j=0 ; j<n.length ; j++) {
                if(i == n[j]) {
                    continue loop; 
                }
            }
            sum += i; 
        }
        return sum; 
    }
    
    public int solution(int[] numbers) {
        int answer = getSum(numbers);
        return answer;
    }
}