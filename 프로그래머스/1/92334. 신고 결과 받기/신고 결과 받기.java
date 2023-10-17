import java.util.*; 

class Solution {
    public int[] getArr(String[] id, String[] r, int k) {
        Map<String, Set<String>> rMap = new HashMap<>(); 
        Map<String, Integer> resultMap = new HashMap<>(); 
        
        for(int i=0 ; i<id.length ; i++) {
            rMap.put(id[i], new HashSet<>()); 
            resultMap.put(id[i], 0); 
        }
        
        for(int i=0 ; i<r.length ; i++) {
            String[] str = r[i].split(" ");
            rMap.get(str[1]).add(str[0]); 
        }
        
        for(int i=0 ; i<id.length ; i++) {
            if(rMap.get(id[i]).size() >= k) {
                for(String name : rMap.get(id[i])) {
                    resultMap.put(name, resultMap.get(name) + 1); 
                }          
            }
        }
        
        int[] result = new int[id.length]; 
        for(int i=0 ; i<id.length ; i++) {
            result[i] = resultMap.get(id[i]); 
        }
        
        return result; 
    }
    
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = getArr(id_list, report, k);
        return answer;
    }
}