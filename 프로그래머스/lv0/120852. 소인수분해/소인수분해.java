import java.util.*; 

class Solution {
    public List<Integer> getArr(int n) {
        List<Integer> arr = new ArrayList<>(); 
        int[] check = new int[n+1];  
        for(int i=2 ; i<=n ; i++) {
            if(check[i] == 0 && n % i == 0) {
                 arr.add(i);
            }
            for(int j=i ; j<=n ; j+=i) {
                check[j]++; 
            }
        }
        
        return arr; 
    }
    
    public List<Integer> solution(int n) {
        List<Integer> answer = getArr(n);
        return answer;
    }
}