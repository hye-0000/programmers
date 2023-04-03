package com.hy.level0.p120835;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = emergency;
        int[] a = Arrays.copyOf(answer, answer.length);
        int[] b = new int[answer.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(answer);
        int idx = answer.length;
        for(int i = 0; i < answer.length; i++){
            map.put(answer[i], idx);
            idx--;
        }
        for(int i = 0; i < answer.length; i++){
            b[i] = map.get(a[i]);
        }
        return b;
    }
}
