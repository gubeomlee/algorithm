import java.util.*; 

class Solution {
    public int[] getArr(int k, int[] s) {
        int[] result = new int[s.length];
        List<Integer> arr = new ArrayList<>(); 
        
        for(int i=0 ; i<s.length ; i++) {
            arr.add(s[i]);
            Collections.sort(arr); 
            if(arr.size() > k) {
                arr.remove(0); 
            }
            result[i] = arr.get(0); 
        }
        
        return result; 
    }
    
    public int[] solution(int k, int[] score) {
        int[] answer = getArr(k, score);
        return answer;
    }
}