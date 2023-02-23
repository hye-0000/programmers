package com.hy.level0.p120824;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(new Solution().solution(num_list)));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [2];

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0) answer[0]++;
            else answer[1]++;
        }

        return answer;
    }
}