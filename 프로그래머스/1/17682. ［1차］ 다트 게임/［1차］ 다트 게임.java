class Solution {
    public int getSum(String d) {
        int idx = 0; 
        int[] arr = new int[3];
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<d.length() ; i++) {
            if('0' <= d.charAt(i) && d.charAt(i) <= '9') {
                sb.append(Character.toString(d.charAt(i))); 
            } else if(d.charAt(i) == 'S' || d.charAt(i) == 'D' || d.charAt(i) == 'T') {
                int cnt = 0; 
                if(d.charAt(i) == 'S') {
                    cnt = 1; 
                } else if(d.charAt(i) == 'D') {
                    cnt = 2; 
                } else if(d.charAt(i) == 'T') {
                    cnt = 3; 
                }
                arr[idx] = (int) Math.pow(Integer.parseInt(sb.toString()) ,cnt);
                sb = new StringBuilder(); 
                idx++; 
            } else if(d.charAt(i) == '*') {
                arr[idx - 1] *= 2; 
                if(idx - 2 >= 0) {
                    arr[idx - 2] *= 2; 
                }
            } else if(d.charAt(i) == '#') {
                arr[idx - 1] *= -1; 
            }
        } 
        return arr[0] + arr[1] + arr[2]; 
    }
    
    public int solution(String dartResult) {
        int answer = getSum(dartResult);
        return answer;
    }
}