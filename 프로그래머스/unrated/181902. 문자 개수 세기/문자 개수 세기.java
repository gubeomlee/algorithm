class Solution {
    public int[] getArr(String str) {
        int[] arr = new int[52]; 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) >= 'a') {
                arr[str.charAt(i) - 'a' + 26]++; 
            } else {
                arr[str.charAt(i) - 'A']++; 
            }
        }
        return arr; 
    }
    
    public int[] solution(String my_string) {
        int[] answer = getArr(my_string);
        return answer;
    }
}