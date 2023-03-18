package com.hy.level0.p120862;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        int result1 = numbers[0] * numbers[1];
        int result2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        if(result1 > result2) {
            answer = result1;
        }else if(result1 <= result2){
            answer = result2;
        }


        return answer;
    }
}