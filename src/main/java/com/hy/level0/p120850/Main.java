package com.hy.level0.p120850;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};

        answer = Arrays.stream(my_string.replaceAll("[^0-9]", "")
                .split(""))
                .sorted()
                .mapToInt(Integer::parseInt)
                .toArray();
        return answer;
    }
}
