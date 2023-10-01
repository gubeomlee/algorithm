import java.util.*; 

class Solution {
    public List<Integer> getArr(String[] str, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>(); 
        for(int i=0 ; i<str.length ; i++) {
            StringBuilder sb = new StringBuilder(); 
            for(int j=0 ; j<l ; j++) {
                sb.append(str[i].charAt(s + j)); 
            }
            if(Integer.parseInt(sb.toString()) > k) {
                arr.add(Integer.parseInt(sb.toString())); 
            }
        }
        return arr; 
    }
    
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = getArr(intStrs, k, s, l);
        return answer;
    }
}