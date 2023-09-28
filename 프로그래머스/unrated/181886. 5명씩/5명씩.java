class Solution {
    public String[] getName(String[] names) {
        String[] arr = new String[(names.length + 4) / 5];
        for(int i=0 ; i<(names.length + 4) / 5; i++) {
            arr[i] = names[i * 5]; 
        }
        return arr; 
    }
    
    public String[] solution(String[] names) {
        String[] answer = getName(names);
        return answer;
    }
}