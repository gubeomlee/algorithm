import java.util.*;

class Solution {
    public List<Integer> getArr(int n) {
        List<Integer> arr = new ArrayList<>(); 
        for(int i=1 ; i<=n/2 ; i++) {
            if(n % i == 0) {
                arr.add(i); 
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