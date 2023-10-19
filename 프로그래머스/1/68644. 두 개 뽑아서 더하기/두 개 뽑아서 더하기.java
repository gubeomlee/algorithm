import java.util.*; 

class Solution {
    public List<Integer> getArr(int[] n) {
        List<Integer> arr = new ArrayList<>(); 
        Set<Integer> set = new HashSet<>(); 
        for(int i=0 ; i<n.length-1 ; i++) {
            for(int j=i+1 ; j<n.length ; j++) {
                if(set.add(n[i] + n[j])) {
                    arr.add(n[i] + n[j]);
                }
            }
        }
        Collections.sort(arr); 
        return arr; 
    }
    
    public List<Integer> solution(int[] numbers) {
        List<Integer> answer = getArr(numbers);
        return answer;
    }
}