package com.hy.level1.p12916;

public class Main {
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char ch;
        int cnt = 0;

        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch == 'p' || ch == 'P')
                cnt ++;
            else if(ch == 'y' || ch == 'Y')
                cnt --;
            if(cnt != 0){
                answer = false;
            }else{
                answer = true;
            }
        }
        return answer;
    }
}