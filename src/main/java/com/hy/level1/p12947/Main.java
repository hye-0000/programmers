package com.hy.level1.p12947;

public class Main {
}

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        if (x % sum == 0) {
            answer = true;
        } else{
            answer = false;
        }
        return answer;
    }
}