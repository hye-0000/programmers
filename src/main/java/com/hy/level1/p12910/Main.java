package com.hy.level1.p12910;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
}
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i <arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()){
            list.add(-1);
        }

        answer = new int[list.size()];

        for(int i = 0; i<list.size() ; i++){
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}