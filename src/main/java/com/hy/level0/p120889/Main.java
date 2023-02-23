package com.hy.level0.p120889;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] sides = {199, 72, 222};
        System.out.println(new Solution().solution(sides));
    }
}

class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);
        if(sides[0]+sides[1] > sides[2]) answer = 1;
        else answer = 2;

        return answer;
    }
}