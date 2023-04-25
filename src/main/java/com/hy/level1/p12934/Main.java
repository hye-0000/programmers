package com.hy.level1.p12934;

public class Main {
}

class Solution {
    public long solution(long n) {
        long answer = 0;

        Double sqrt = Math.sqrt(n);

        if(sqrt == sqrt.intValue()){
            answer = (long)Math.pow(sqrt + 1, 2);
        } else answer =  -1;
        return answer;
    }
}