import java.util.*; 
class Solution {
    public List<Integer> getArr(String str) {
        int cnt = 0;
        List<Integer> arr = new ArrayList<>(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) == 'x') {
                arr.add(cnt);
                cnt = 0; 
            } else {
                cnt++; 
            }
        }
        arr.add(cnt); 
        return arr; 
    }
    public List<Integer> solution(String myString) {
        List<Integer> answer = getArr(myString);
        return answer;
    }
}