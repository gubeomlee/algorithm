import java.util.*; 

class Solution {
    public List<Integer> getArr(int n, int[] list) {
        List<Integer> arr = new ArrayList<>(); 
        for(int i=0 ; i<list.length ; i++) {
            if(list[i] % n == 0) {
                arr.add(list[i]); 
            }
        }
        
        return arr; 
    }
    
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = getArr(n, numlist);
        return answer;
    }
}