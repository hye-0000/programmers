package com.hy.level0.p120897;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0) list.add(i);
        }

        int[] answer = new int[list.size()];

        for (int i = 0 ; i < list.size() ; i++)
            answer[i] = list.get(i).intValue();

        // int[] answer = list.stream()
        //         .mapToInt(i -> i)
        //         .toArray();

        //	int[] answer = list.stream()
        //        .mapToInt(Integer::intValue)
        //        .toArray();

        return answer;
    }
}