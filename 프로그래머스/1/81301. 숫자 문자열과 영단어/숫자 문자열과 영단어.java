import java.util.*; 

class Solution {
    public int getInt(String s) {
        Map<String, String> map = new HashMap<>(); 
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        StringBuilder sb = new StringBuilder(); 
        StringBuilder temp = new StringBuilder(); 
        
        for(int i=0 ; i<s.length() ; i++) {
            if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                sb.append(Character.toString(s.charAt(i)));
            } else {
                temp.append(Character.toString(s.charAt(i)));
                if(map.containsKey(temp.toString())){
                    sb.append(map.get(temp.toString())); 
                    temp = new StringBuilder(); 
                }
            }
        }
        
        if(temp.toString().length() > 0) {
            sb.append(map.get(temp.toString())); 
        }
        
        return Integer.parseInt(sb.toString()); 
    }
    
    public int solution(String s) {
        int answer = getInt(s);
        return answer;
    }
}