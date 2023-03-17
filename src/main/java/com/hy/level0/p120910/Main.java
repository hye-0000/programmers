package com.hy.level0.p120910;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++){
            answer *= 2;
        }
        return answer;
    }
}
