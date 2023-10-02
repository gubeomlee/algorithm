import java.util.*; 

class Solution {
    public List<String> getArr(String[] arr, int k) {
        List<String> result = new ArrayList<>();
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=0 ; j<k ; j++) {
                StringBuilder sb = new StringBuilder();
                for(int l=0 ; l<arr[i].length() ; l++) {
                    for(int n=0 ; n<k ; n++) {
                        sb.append(arr[i].charAt(l)); 
                    }
                }
                result.add(sb.toString()); 
            }
        }
        return result; 
    }
    
    public List<String> solution(String[] picture, int k) {
        List<String> answer = getArr(picture, k);
        return answer;
    }
}