package com.hy.level0.p120891;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int order) {
        int answer = 0;
        String order_ = order + "";

        for(int i = 0; i < order_.length(); i++){
            if(order_.charAt(i) == '3' || order_.charAt(i) == '6' || order_.charAt(i) == '9') {
                answer++;
            }
        }
        return answer;
    }
}