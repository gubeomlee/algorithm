import java.util.*; 

class Solution {
    public String[] getArr(String[] s, int n) {
        Arrays.sort(s); 
        Arrays.sort(s, new Comparator<String>() {
            @Override 
            public int compare(String o1, String o2) {
                return o1.charAt(n) - o2.charAt(n); 
            }
        }); 
        return s; 
    }
    
    public String[] solution(String[] strings, int n) {
        String[] answer = getArr(strings, n);
        return answer;
    }
}