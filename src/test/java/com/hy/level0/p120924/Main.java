package com.hy.level0.p120924;

public class Main {
}

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[2]-common[1] == common[1]-common[0])
            answer = common[common.length - 1] + (common[1]-common[0]);
        else
            answer = common[common.length-1] * common[2]/common[1];
        return answer;
    }
}