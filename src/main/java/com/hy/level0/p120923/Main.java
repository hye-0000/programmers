package com.hy.level0.p120923;

public class Main {
}

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a = (2 * total / num -num +1)/2;
        for(int i = 0; i < num ; i++){
            answer[i] = a;
            a++;
        }
        return answer;
    }
}