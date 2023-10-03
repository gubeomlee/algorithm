import java.util.*; 

class Solution {
    public boolean isRight(String str) {
        String[] arr = str.split(" "); 
        if(arr[1].equals("-") && Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ) {
            return true; 
        } else if (arr[1].equals("+") && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) { 
            return true; 
        }
        return false ; 
    }    
    
    public String[] getArr(String[] quiz) {
        String[] arr = new String[quiz.length]; 
        for(int i=0 ; i<arr.length ; i++) {
            if(isRight(quiz[i])) {
                arr[i] = "O";   
            } else {
                arr[i] = "X"; 
            } 
        }
        
        return arr; 
    }
    
    public String[] solution(String[] quiz) {
        String[] answer = getArr(quiz);
        return answer;
    }
}