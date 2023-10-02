import java.util.*; 

class Solution {
    public int getNum(int[] rank, boolean[] att) {
        List<int[]> arr = new ArrayList<>(); 
        for(int i=0 ; i<rank.length ; i++) {
            if(att[i]) {
                arr.add(new int[] {rank[i], i});
            }
        }
        
        Collections.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0]; 
            }
        }); 
        
        int num = 0; 
        num += arr.get(0)[1] * 10000;
        num += arr.get(1)[1] * 100;
        num += arr.get(2)[1];
        
        return num; 
    }
    
    public int solution(int[] rank, boolean[] attendance) {
        int answer = getNum(rank, attendance);
        return answer;
    }
}