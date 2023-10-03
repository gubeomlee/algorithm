class Solution {
    public String login(String[] arr, String[][] db) {
        for(int i=0 ; i<db.length ; i++) {
            if(arr[0].equals(db[i][0]) && arr[1].equals(db[i][1])) {
                return "login"; 
            } else if(arr[0].equals(db[i][0])) {
                return "wrong pw"; 
            }
        }
        return "fail"; 
    }
    
    public String solution(String[] id_pw, String[][] db) {
        String answer = login(id_pw, db);
        return answer;
    }
}