class Solution {
    public String getSum(String b1, String b2) {
        return Integer.toBinaryString(Integer.parseInt(b1, 2) + Integer.parseInt(b2, 2)); 
    }
    
    public String solution(String bin1, String bin2) {
        String answer = getSum(bin1, bin2);
        return answer;
    }
}