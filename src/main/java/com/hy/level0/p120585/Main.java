package com.hy.level0.p120585;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        System.out.println(new Solution().solution(array, 167));
    }
}

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > height) cnt++;
        }
        answer = cnt;
        return answer;
    }
}