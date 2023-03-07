package com.hy.level0.p120906;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public int solutionV2(int n){
        return (n + "") //123 => "123"
                .chars() //"123" => intStream[49, 50, 51]
                .map(e -> Character.getNumericValue(e)) //intStream[49 50, 51] => intStream[1, 2, 3]
                .sum(); //intStream[1, 2, 3] => 6
    }
    public int solutionV3(int n){
        return (n + "") //123 => "123"
                .chars() //"123" => intStream[49, 50, 51]
                .map(Character::getNumericValue) //intStream[49 50, 51] => intStream[1, 2, 3]
                .sum(); //intStream[1, 2, 3] => 6
    }
}