package com.hy.level0.p120864;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-Z]");

        for (int i = 0; i < str.length; i++) {
            answer+= !str[i].isEmpty() ? Integer.parseInt(str[i]) :0;
        }

        return answer;
    }
}