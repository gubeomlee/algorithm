import java.util.*; 

class Solution {
    public String getStr(String str) {
        Map<String, Character> morseCodeMap = new HashMap<>();
        morseCodeMap.put(".-", 'a');
        morseCodeMap.put("-...", 'b');
        morseCodeMap.put("-.-.", 'c');
        morseCodeMap.put("-..", 'd');
        morseCodeMap.put(".", 'e');
        morseCodeMap.put("..-.", 'f');
        morseCodeMap.put("--.", 'g');
        morseCodeMap.put("....", 'h');
        morseCodeMap.put("..", 'i');
        morseCodeMap.put(".---", 'j');
        morseCodeMap.put("-.-", 'k');
        morseCodeMap.put(".-..", 'l');
        morseCodeMap.put("--", 'm');
        morseCodeMap.put("-.", 'n');
        morseCodeMap.put("---", 'o');
        morseCodeMap.put(".--.", 'p');
        morseCodeMap.put("--.-", 'q');
        morseCodeMap.put(".-.", 'r');
        morseCodeMap.put("...", 's');
        morseCodeMap.put("-", 't');
        morseCodeMap.put("..-", 'u');
        morseCodeMap.put("...-", 'v');
        morseCodeMap.put(".--", 'w');
        morseCodeMap.put("-..-", 'x');
        morseCodeMap.put("-.--", 'y');
        morseCodeMap.put("--..", 'z');
        
        StringBuilder sb = new StringBuilder(); 
        String[] strArr = str.split(" "); 
        for(int i=0 ; i<strArr.length ; i++) {
            sb.append(morseCodeMap.get(strArr[i])); 
        }

        return sb.toString(); 
    }
    
    public String solution(String letter) {
        String answer = getStr(letter);
        return answer;
    }
}