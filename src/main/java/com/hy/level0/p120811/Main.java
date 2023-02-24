package com.hy.level0.p120811;
import java.util.*;
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);

        answer = array[array.length/2];
        return answer;
    }
}