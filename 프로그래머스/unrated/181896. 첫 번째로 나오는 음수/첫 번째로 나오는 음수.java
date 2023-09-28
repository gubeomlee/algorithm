class Solution {
    public int getIdx(int[] list) {
        for(int i=0 ; i<list.length ; i++) {
            if(list[i] < 0) {
                return i; 
            }
        }
        return -1; 
    }
    
    public int solution(int[] num_list) {
        int answer = getIdx(num_list);
        return answer;
    }
}