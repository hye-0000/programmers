package com.hy.level0.p120834;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(int age) {
        String answer = "";
        String age_ = age + "";

        for(int i = 0; i < age_.length(); i++){
            answer += (char)(age_.charAt(i) + 49);
        }

        return answer;
    }
}