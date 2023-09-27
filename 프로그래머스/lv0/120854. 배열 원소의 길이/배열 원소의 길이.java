class Solution {
    public int[] getStringLen(String[] strlist) {
        int len = strlist.length; 
        int[] arr = new int[len]; 
        for(int i=0 ; i<len ; i++) {
            arr[i] = strlist[i].length(); 
        }
        
        return arr; 
    }
    
    public int[] solution(String[] strlist) {
        int[] answer = getStringLen(strlist);
        return answer;
    }
}