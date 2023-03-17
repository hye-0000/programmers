package com.hy.level0.p120905;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0) list.add(numlist[i]);
        }

        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
