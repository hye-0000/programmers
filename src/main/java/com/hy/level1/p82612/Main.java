package com.hy.level1.p82612;

public class Main {
}

class Solution {
    public long solution(int price, int money, int count) {
        long answer;
        long sum = 0;

        for(int i = 1; i <= count; i++){
            sum += price * i;
        }

        if(sum - money > 0) answer = sum - (long)money;
        else return 0;

        return answer;
    }
}