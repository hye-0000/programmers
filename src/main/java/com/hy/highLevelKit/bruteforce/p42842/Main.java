package com.hy.highLevelKit.bruteforce.p42842;

public class Main {
}
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int sum = brown + yellow;

        for(int i = 1; i < sum; i++){
            int row = i;
            int col = sum / row;

            if(row > col) continue;

            if((col - 2) * (row - 2) == yellow){
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }
        return answer;
    }
}