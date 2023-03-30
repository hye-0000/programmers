package com.hy.level0.p120848;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 1;

        while(result <= n){
            answer++;
            result *= answer;
        }
        return answer - 1;
    }
}
//result가 n보다 클 때 반복문을 탈출하기 때문에 answer은 항상 원하는 수 보다 크게됨
//3!일땐 조건을 만족하므로 4!까지 돌고 반복문 탈출
//때문에 answer -1을 리턴해줌
