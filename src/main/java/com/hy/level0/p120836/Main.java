package com.hy.level0.p120836;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n/2; i++){
            if(n % i == 0) answer++;
        }
        answer++; //마지막 (n, 1) 더해주기
        return answer;
    }
}