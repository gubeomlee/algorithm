import java.util.*; 

class Solution {
    public int getNum(int a, int b, int c, int d) {
        int[][] arr = {{a, 0}, {b, 0}, {c, 0}, {d, 0}};
        for(int i=0 ; i<4 ; i++) {
            for(int j=0 ; j<4 ; j++) {
                if(arr[i][0] == arr[j][0]) {
                    arr[i][1]++; 
                }
            }
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override 
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0]; 
            }
        }); 
            
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override 
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1]; 
            }
        }); 
        
        if(arr[3][1] == 4) {
            return 1111 * a; 
        } else if(arr[3][1] == 3) {
            return (int) Math.pow(10 * arr[3][0] + arr[0][0], 2); 
        } else if(arr[3][1] == 2 && arr[0][1] == 2) {
            return (arr[3][0] + arr[0][0]) * Math.abs(arr[3][0] - arr[0][0]); 
        } else if(arr[3][1] == 2 && arr[0][1] == 1) {
            return arr[0][0] * arr[1][0]; 
        } else {
            return Math.min(Math.min(a, b), Math.min(c, d)); 
        }
    }
    
    public int solution(int a, int b, int c, int d) {
        int answer = getNum(a, b, c, d);
        return answer;
    }
}