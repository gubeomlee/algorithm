class Solution {
    public int getCnt(int hp) {
        int cnt = 0; 
        cnt += hp / 5; 
        hp %= 5; 
        cnt += hp / 3;
        hp %= 3; 
        cnt += hp; 
        return cnt; 
    }
    
    public int solution(int hp) {
        int answer = getCnt(hp);
        return answer;
    }
}