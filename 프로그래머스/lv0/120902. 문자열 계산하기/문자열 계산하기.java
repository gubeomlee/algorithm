class Solution {
    public int getNum(String str) {
        int num = 0; 
        String[] arr = str.split(" ");
        num += Integer.parseInt(arr[0]); 
        for(int i=1 ; i<arr.length ; i+=2) {
            if(arr[i].equals("+")) {
                num += Integer.parseInt(arr[i+1]); 
            } else {
                num -= Integer.parseInt(arr[i+1]);
            }
        }
        
        return num; 
    }
    
    public int solution(String my_string) {
        int answer = getNum(my_string);
        return answer;
    }
}