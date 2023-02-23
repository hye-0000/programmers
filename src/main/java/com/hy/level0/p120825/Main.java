package com.hy.level0.p120825;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            for (int j = 0; j < n; j++){
                answer += my_string.charAt(i);
            }
        }

        // for(int i = 0; i < n; i++){
        //     dap += answer.charAt(0);
        // }
        // for(int i = 0; i < n; i++){
        //     dap += answer.charAt(1);
        // }
        // for(int i = 0; i < n; i++){
        //     dap += answer.charAt(2);
        // }
        // for(int i = 0; i < n; i++){
        //     dap += answer.charAt(3);
        // }
        // for(int i = 0; i < n; i++){
        //     dap += answer.charAt(4);
        // }

        return answer;
    }
}