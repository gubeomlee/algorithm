class Solution {
    public int getInt(int[] list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0 ; i<list.length ; i++) {
            if(list[i] % 2 == 1) {
                sb1.append(list[i]);
            } else {
                sb2.append(list[i]); 
            }
        }
        return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString()); 
    }
    
    public int solution(int[] num_list) {
        int answer = getInt(num_list);
        return answer;
    }
}