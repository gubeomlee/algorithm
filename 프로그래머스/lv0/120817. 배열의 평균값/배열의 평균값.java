class Solution {
    public double getAvg(int[] numbers) {
        int sum = 0; 
        for(int i=0 ; i<numbers.length ; i++) {
            sum += numbers[i]; 
        }
        
        return (double) sum / numbers.length; 
    } 
    
    public double solution(int[] numbers) {
        double answer = getAvg(numbers);
        System.out.println(answer); 
        return answer;
    }
}