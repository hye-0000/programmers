package com.hy.level0.p120885;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";

        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int sum = num1+num2;

        answer = Integer.toBinaryString(sum);
        return answer;
    }
}