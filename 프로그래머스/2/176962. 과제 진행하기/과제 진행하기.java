import java.util.*; 

class Solution {
    public int getTime(String str) {
        String[] cur = str.split(":"); 
        return Integer.parseInt(cur[0]) * 60 + Integer.parseInt(cur[1]);  
    }
    
    public List<String> getArr(String[][] p) {
        Arrays.sort(p, (o1, o2) -> {
            return o1[1].compareTo(o2[1]); 
        }); 
        
        int cur = getTime(p[0][1]); 
        Stack<Integer> stack = new Stack<>(); 
        List<String> result = new ArrayList<>(); 
        
        for(int i=1 ; i<p.length ; i++) {
            int temp = cur + Integer.parseInt(p[i-1][2]); 
            int now = getTime(p[i][1]); 
            if(now < temp) {
                stack.add(i-1); 
                p[i-1][2] = Integer.toString(Integer.parseInt(p[i-1][2]) - now + cur); 
                cur = now; 
            } else if (now == temp || stack.isEmpty()) {
                result.add(p[i-1][0]); 
                cur = now; 
            } else if (!stack.isEmpty()) {
                result.add(p[i-1][0]); 
                cur = temp; 
                while(now > cur && !stack.isEmpty()) {
                    if(now - cur >= Integer.parseInt(p[stack.peek()][2])) {
                        cur += Integer.parseInt(p[stack.peek()][2]); 
                        result.add(p[stack.pop()][0]); 
                    } else {
                        p[stack.peek()][2] = Integer.toString(Integer.parseInt(p[stack.peek()][2]) - now + cur);
                        cur = now;  
                    }
                }
                if(stack.isEmpty()) {
                    cur = now; 
                }
            }
        }
        
//         for(String[] s : p) {
//             System.out.println(Arrays.toString(s)); 
//         }
        
        result.add(p[p.length - 1][0]); 
        while(!stack.isEmpty()) {
            result.add(p[stack.pop()][0]); 
        }

        return result; 
    }
    
    public List<String> solution(String[][] plans) {
        List<String> answer = getArr(plans);
        return answer;
    }
}