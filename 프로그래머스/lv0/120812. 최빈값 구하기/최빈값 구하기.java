import java.util.*; 

class Solution {
    public int getNum(int[] arr) {
        Arrays.sort(arr);
        Stack<Integer> stack = new Stack<>(); 
        int cnt = 1; 
        int maxCnt = 1;
        int num = arr[0]; 
        for(int i=1 ; i<arr.length ; i++) {
            if(num == arr[i]) {
                cnt++; 
            } else {
                if(cnt > maxCnt) {
                    maxCnt = cnt; 
                    stack.clear(); 
                    stack.add(num); 
                } else if(cnt == maxCnt) {
                    stack.add(num); 
                }
                cnt = 1; 
                num = arr[i]; 
            }
        }
        
        if(cnt == maxCnt) {
            stack.add(num); 
        } else if(cnt > maxCnt) {
            stack.clear(); 
            stack.add(num); 
        }
        
        if(stack.size() > 1) {
            return -1; 
        }
        return stack.peek(); 
    }
    
    public int solution(int[] array) {
        int answer = getNum(array);
        return answer;
    }
}