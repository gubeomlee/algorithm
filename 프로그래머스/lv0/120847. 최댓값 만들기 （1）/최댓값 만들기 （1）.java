import java.util.*; 

class Solution {
    public int getMax(int[] numbers) {
        Arrays.sort(numbers); 
        return numbers[numbers.length - 1] * numbers[numbers.length - 2]; 
    }
    
    public int solution(int[] numbers) {
        int answer = getMax(numbers); 
        return answer;
    }
}