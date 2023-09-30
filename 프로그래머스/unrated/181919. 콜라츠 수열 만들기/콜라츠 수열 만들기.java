import java.util.*;

class Solution {
    public List<Integer> getArr(int n) {
        List<Integer> arr = new ArrayList<>(); 
        while(n > 1) {
            arr.add(n); 
            if(n % 2 == 0) {
                n /= 2; 
            } else {
                n = 3 * n + 1; 
            }
        }
        arr.add(n); 
        return arr; 
    }
    
    public List<Integer> solution(int n) {
        List<Integer> answer = getArr(n);
        return answer;
    }
}