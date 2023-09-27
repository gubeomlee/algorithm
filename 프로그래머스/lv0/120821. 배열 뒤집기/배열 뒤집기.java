class Solution {
    public int[] getReverse(int[] list) {
        for(int i=0 ; i<list.length/2 ; i++) {
            int temp = list[i]; 
            list[i] = list[list.length - 1 - i]; 
            list[list.length - 1 - i] = temp; 
        }
        
        return list;
    }
    
    public int[] solution(int[] num_list) {
        int[] answer = getReverse(num_list);
        return answer;
    }
}