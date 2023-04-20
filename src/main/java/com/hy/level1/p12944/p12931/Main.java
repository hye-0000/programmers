package com.hy.level1.p12944.p12931;

public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}