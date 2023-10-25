import java.util.*; 

class Solution {
    public String getStr(String s) {
        StringBuilder sb = new StringBuilder(); 
        String[] arr = s.split(" ", -1);
        // for(int i=0 ; i<s.length() ; i++) {
        //     if(s.charAt(i) == ' ') {
        //         if(sb.length() > 0) {
        //             arr.add(sb.toString()); 
        //             sb = new StringBuilder(); 
        //         }
        //     } else {
        //         sb.append(Character.toString(s.charAt(i))); 
        //     }
        // }
        // if(sb.length() > 0) {
        //     arr.add(sb.toString()); 
        //     sb = new StringBuilder();
        // }
        
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=0 ; j<arr[i].length() ; j++) {
                if(j % 2 == 0) {
                    if(arr[i].charAt(j) >= 'a') {
                        sb.append(Character.toString(arr[i].charAt(j) - 'a' + 'A')); 
                    } else {
                        sb.append(Character.toString(arr[i].charAt(j)));
                    }
                    
                } else {
                    if(arr[i].charAt(j) >= 'a') {
                        sb.append(Character.toString(arr[i].charAt(j)));
                    } else {
                        sb.append(Character.toString(arr[i].charAt(j) - 'A' + 'a')); 
                    }
                }
            }
            sb.append(" "); 
        }
        sb.deleteCharAt(sb.length() - 1); 
        return sb.toString(); 
    }
    
    public String solution(String s) {
        String answer = getStr(s);
        return answer;
    }
}