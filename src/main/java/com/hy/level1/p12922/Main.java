package com.hy.level1.p12922;

public class Main {
}
class Solution {
    public String solution(int n) {
        String answer = "";

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                answer += "수";
            } else{
                answer += "박";
            }
        }
        return answer;
    }
}