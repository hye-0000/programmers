package com.hy.level1.p12944;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i: arr){
            sum += i;
        }
        answer = sum/arr.length;
        return answer;
    }
}