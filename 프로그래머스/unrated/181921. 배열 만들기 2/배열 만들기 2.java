import java.util.*; 

class Solution {
    public void dfs(int l, int r, int temp, List<Integer> result) {
        if(temp <= r) {
            if(temp >= l) {
                result.add(temp); 
            }
            
            if(temp % 10 == 5) {
                dfs(l, r, temp * 10, result); 
            } else {
                dfs(l, r, temp + 5, result); 
                dfs(l, r, temp * 10, result);
            }
        }
    }
    
    public List<Integer> getArr(int l, int r) {
        List<Integer> result = new ArrayList<>(); 
        dfs(l, r, 5, result); 
        Collections.sort(result);
        if(result.size() == 0) {
            result.add(-1); 
        }
        return result; 
    }
    
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = getArr(l, r);
        return answer;
    }
}