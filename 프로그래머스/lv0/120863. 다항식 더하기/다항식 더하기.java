class Solution {
    public String getStr(String p) {
        int x = 0; 
        int num = 0; 
        
        String[] arr = p.split(" "); 
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i].contains("x")) {
                if(arr[i].length() == 1) {
                    x++; 
                } else {
                    x += Integer.parseInt(arr[i].substring(0, arr[i].length() - 1)); 
                }
            } else if(!arr[i].equals("+")) {
                num += Integer.parseInt(arr[i]); 
            }
        }
        
        if(num == 0) {
            if(x == 1) {
                return String.format("x");
            } else {
                return String.format("%dx", x);   
            } 
        } else if (x == 0) {
            return String.format("%d", num); 
        } else if (x == 1) {
            return String.format("x + %d", num); 
        }
        return String.format("%dx + %d", x, num); 
    }
    
    public String solution(String polynomial) {
        String answer = getStr(polynomial);
        return answer;
    }
}