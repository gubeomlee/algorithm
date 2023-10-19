import java.util.*; 

class Solution {
    public int[] getArr(int n, int[] s) {
        int[] arr = new int[n + 1]; 
        int[] sumArr = new int[n + 1];
        
        for(int i=0 ; i<s.length ; i++) {
            if(s[i] <= n) {
                arr[s[i]]++; 
            }
        }
        
        for(int i=1 ; i<arr.length ; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i];    
        }
        
        double[][] temp = new double[n + 1][2]; 
        for(int i=1 ; i<arr.length ; i++) {
            temp[i][0] = i;        
            temp[i][1] = (s.length - sumArr[i - 1] == 0) ? 0 : (double) arr[i] / (s.length - sumArr[i - 1]);
        }
        
        Arrays.sort(temp, 1, n + 1, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[1], o1[1]);
            }
        });
        
        int[] result = new int[n]; 
        for(int i=0 ; i<n ; i++) {
            result[i] = (int) temp[i+1][0]; 
        }
        
        return result; 
    }
    
    public int[] solution(int N, int[] stages) {
        int[] answer = getArr(N, stages);
        return answer;
    }
}