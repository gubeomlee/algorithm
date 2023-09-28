class Solution {
    public String[] getStr(String[] list, boolean[] check) {
        int cnt = 0; 
        for(int i=0 ; i<check.length ; i++) {
            if(!check[i]) {
                cnt++; 
            }
        }
        
        String[] arr = new String[cnt];
        int idx = 0; 
        for(int i=0 ; i<list.length ; i++) {
            if(!check[i]) {
                arr[idx++] = list[i]; 
            }
        }
        return arr; 
    }
    
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = getStr(todo_list, finished);
        return answer;
    }
}