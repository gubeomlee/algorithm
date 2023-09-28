class Solution {
    public int find(int[] list, int n) {
        for(int i=0 ; i<list.length ; i++) {
            if(list[i] == n) {
                return 1; 
            } 
        }
        
        return 0; 
    } 
    
    public int solution(int[] num_list, int n) {
        int answer = find(num_list, n);
        return answer;
    }
}