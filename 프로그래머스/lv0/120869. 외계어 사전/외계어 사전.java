class Solution {
    public int getNum(String[] spell, String[] dic) {
        loop: for(int i=0 ; i<dic.length ; i++) {
            for(int j=0 ; j<spell.length ; j++) {
                if(!dic[i].contains(spell[j])) {
                    continue loop; 
                }
            }
            return 1;
        }
        return 2;
    }
    
    public int solution(String[] spell, String[] dic) {
        int answer = getNum(spell, dic);
        return answer;
    }
}