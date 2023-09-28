class Solution {
    public String[] getArr(String[] arr) {
        for(int i=0 ; i<arr.length ; i++) {
            if(i % 2 == 0) {
                arr[i] = arr[i].toLowerCase(); 
            } else {
                arr[i] = arr[i].toUpperCase(); 
            }
        }
        return arr; 
    }
    
    public String[] solution(String[] strArr) {
        String[] answer = getArr(strArr);
        return answer;
    }
}