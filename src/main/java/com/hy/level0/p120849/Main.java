package com.hy.level0.p120849;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
//        if(my_string.equals("bus")){
//            answer = "bs";
//        } else if (my_string.equals("nice to meet you")) {
//            answer = "nc t mt y";
//        }
        return answer;
    }
}