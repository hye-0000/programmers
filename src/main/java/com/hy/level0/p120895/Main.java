package com.hy.level0.p120895;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        char temp = sb.charAt(num1);

        sb.setCharAt(num1, sb.charAt(num2));
        sb.setCharAt(num2, temp);

        return sb.toString();
    }
}
