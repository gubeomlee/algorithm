import java.util.*; 

class Solution {
    public List<Integer> getArr(int n, int[] slicer, int[] list) {
        int a = slicer[0]; 
        int b = slicer[1];
        int c = slicer[2]; 
        
        List<Integer> arr = new ArrayList<>();
        for(int num : list) {
            arr.add(num); 
        }
        
        if(n == 1) {
            return arr.subList(0, b + 1); 
        } else if(n == 2) {
            return arr.subList(a, arr.size()); 
        } else if(n == 3) {
            return arr.subList(a, b + 1); 
        } else {
            List<Integer> result = new ArrayList<>(); 
            for(int j=a ; j<= b ; j+=c) {
                result.add(list[j]); 
            }
            return result;
        }
    }
    
    public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = getArr(n, slicer, num_list);
        return answer;
    }
}