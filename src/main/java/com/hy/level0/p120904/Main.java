package com.hy.level0.p120904;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numStr = num+"";
        String kStr = k+"";

        if(numStr.indexOf(kStr) == -1) answer = -1;
        else answer = numStr.indexOf(kStr) + 1;

        return answer;
    }
}
