package com.hy.level1.p86051;

public class Main {
}
class Solution {
    public int solution(int[] numbers) {
        int answer = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
        for(int i = 0; i < numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
}