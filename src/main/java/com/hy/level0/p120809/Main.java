package com.hy.level0.p120809;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i<numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}