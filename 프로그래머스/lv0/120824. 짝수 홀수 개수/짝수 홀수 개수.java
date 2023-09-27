class Solution {
    public int[] getCnt(int[] list) {
        int[] result = new int[2]; 
        int cnt = 0; 
        for(int i=0 ; i<list.length ; i++) {
            if(list[i] % 2 == 0) {
                cnt++; 
            }
        }
        result[0] = cnt; 
        result[1] = list.length - cnt; 
        return result; 
    }
    
    public int[] solution(int[] num_list) {
        int[] answer = getCnt(num_list);
        return answer;
    }
}