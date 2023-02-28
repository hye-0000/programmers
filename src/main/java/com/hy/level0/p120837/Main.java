package com.hy.level0.p120837;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int hp) {
        int answer = hp/5;
        hp %= 5;

        answer+=hp/3;
        hp %= 3;

        answer+=hp/1;

        return answer;
    }
}