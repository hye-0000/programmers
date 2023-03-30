package com.hy.level0.p120887;

public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String check = k+"";

        //i~j까지 비교
        for(int a = i; a<=j; a++) {
            String str = a+"";
            //a번째 숫자가 k를 가지고 있다면
            if(str.contains(check) ) {
                //비교를 위해 a를 배열로 쪼갬
                String[] arr = str.split("");
                //k가 몇번 들어있나 카운트
                for(int b =0; b<arr.length; b++) {
                    if(arr[b].equals(check)) answer ++;
                }
            }
        }
        return answer;
    }
}