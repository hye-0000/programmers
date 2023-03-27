package com.hy.level0.p120911;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.toLowerCase().split("");
        answer = Arrays.stream(arr).sorted().collect(Collectors.joining());
        return answer;
    }
}