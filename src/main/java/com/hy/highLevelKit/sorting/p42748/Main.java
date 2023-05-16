package com.hy.highLevelKit.sorting.p42748;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        int temp = 0;

        for(int x = 0; x < 3; x ++){
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];

            for(i= i - 1 ; i < j ; i++){
                list.add(array[i]);
            }
            Collections.sort(list);
            temp = list.get(k);
            list.clear();
        }
        for(int q = 0; q < commands.length; q++){
            answer[q] = temp;
        }
        return answer;
    }
}