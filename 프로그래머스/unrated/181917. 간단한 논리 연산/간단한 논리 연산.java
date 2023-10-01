class Solution {
    public boolean check(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4); 
    }
    
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = check(x1, x2, x3, x4);
        return answer;
    }
}