package com.hy.level0.p120838;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morseList = { ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        String[] morse = letter.split(" ");
        for(String s : morse){
            for(int i = 0; i < morseList.length; i++){
                if (s.equals(morseList[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }
        return answer;
    }
}