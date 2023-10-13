import java.util.*; 

class Solution {
    public int getCnt(int[] ingredient) {
        int cnt = 0; 
        
        List<Integer> arr = new ArrayList<>(); 
        for(int i=0 ; i<ingredient.length ; i++) {
            arr.add(ingredient[i]); 
            if(arr.size() >= 4) {
                if(arr.get(arr.size() - 1) == 1 && arr.get(arr.size() - 2) == 3 && arr.get(arr.size() - 3) == 2 && arr.get(arr.size() - 4) == 1) {
                    cnt++; 
                    arr.remove(arr.size() - 1);
                    arr.remove(arr.size() - 1);
                    arr.remove(arr.size() - 1);
                    arr.remove(arr.size() - 1);
                }
            }
        }
        
        return cnt; 
    }
    
    public int solution(int[] ingredient) {
        int answer = getCnt(ingredient);
        return answer;
    }
}