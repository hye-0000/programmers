package com.hy.highLevelKit.bruteforce.p42840;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int[] answers) {

        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int s1 = 0; int s2 = 0; int s3 = 0;

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == p1[i % p1.length]) s1++;
            if(answers[i] == p2[i % p1.length]) s2++;
            if(answers[i] == p3[i % p1.length]) s3++;
        }
        int max = Math.max(Math.max(s1, s2), s3);
        List<Integer> list = new ArrayList<>();
        if(s1 == max) list.add(1);
        if(s2 == max) list.add(2);
        if(s3 == max) list.add(3);

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}