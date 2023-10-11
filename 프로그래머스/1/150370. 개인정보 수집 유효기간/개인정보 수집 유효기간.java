import java.util.*; 

class Solution {
    public List<Integer> getArr(String today, String[] terms, String[] p) {
        List<Integer> arr = new ArrayList<>(); 
        
        String[] tSplit = today.split("\\."); 
        int todaySum = Integer.parseInt(tSplit[0]) * 336 + Integer.parseInt(tSplit[1]) * 28 + Integer.parseInt(tSplit[2]);  
            
        for(int i=0 ; i<p.length ; i++) {
            String[] temp = p[i].split(" ");
            String[] tempDay = temp[0].split("\\.");
            int daySum = Integer.parseInt(tempDay[0]) * 336 + Integer.parseInt(tempDay[1]) * 28 + Integer.parseInt(tempDay[2]);  
            for(int j=0 ; j<terms.length ; j++) {
                if(temp[1].equals(terms[j].split(" ")[0])) {
                    daySum += Integer.parseInt(terms[j].split(" ")[1]) * 28 - 1;
                    if(daySum < todaySum) {
                        arr.add(i + 1); 
                    }
                    break; 
                }
            }
        }
         
        return arr; 
    } 
    
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = getArr(today, terms, privacies);
        return answer;
    }
}