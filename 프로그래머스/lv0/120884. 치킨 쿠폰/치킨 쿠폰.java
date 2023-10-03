class Solution {
    public int getNum(int n) {
        int num = 0; 
        while(n >= 10) {
            num += n / 10;
            n = n % 10 + n / 10; 
        }

        return num; 
    }
    
    public int solution(int chicken) {
        int answer = getNum(chicken);
        return answer;
    }
}