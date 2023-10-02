class Solution {
    public boolean isLatte(String str) {
        for(int i=0 ; i<=str.length() - 5 ; i++) {
            if(str.substring(i, i+5).equals("latte")) {
                return true; 
            }
        }
        return false; 
    }
    
    public int getSum(String[] order) {
        int sum = order.length * 4500;
        
        for(int i=0 ; i<order.length ; i++) {
            if(isLatte(order[i])) {
                sum += 500; 
            }
        }
        return sum; 
    }
    
    public int solution(String[] order) {
        int answer = getSum(order);
        return answer;
    }
}