package com.hy.level0.p181938;

public class Main {
}
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s = a + "" + b;
        if(Integer.parseInt(s) > 2*a*b) answer = Integer.parseInt(s);
        else answer = 2*a*b;

        return answer;
    }
}