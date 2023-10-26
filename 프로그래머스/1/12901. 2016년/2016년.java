class Solution {
    public String getStr(int a, int b) {
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        String[] result = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int sum = b; 
        for(int i=0 ; i<a-1 ; i++) {
            sum += day[i]; 
        }

        return result[(sum + 4) % 7]; 
    }
    
    public String solution(int a, int b) {
        String answer = getStr(a, b);
        return answer;
    }
}