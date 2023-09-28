import java.util.*; 

class Solution {
    public int[] getArr(int[] arr, int[] del) {
        List<Integer> list = new ArrayList<>(); 
        Arrays.sort(del); 
        for(int i=0 ; i<arr.length ; i++) {
            if(Arrays.binarySearch(del, arr[i]) < 0) {
                list.add(arr[i]); 
            }
        }
        int[] result = new int[list.size()]; 
        for(int i=0 ; i<list.size() ; i++) {
            result[i] = list.get(i); 
        } 
        return result; 
    }
    
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = getArr(arr, delete_list);
        return answer;
    }
}