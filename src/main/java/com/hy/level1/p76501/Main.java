package com.hy.level1.p76501;

public class Main {
}
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i<absolutes.length; i++){
            if(signs[i] == false){
                answer += absolutes[i] * -1;
            }else{
                answer += absolutes[i];
            }
        }
        return answer;
    }
}