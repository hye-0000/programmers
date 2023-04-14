package com.hy.level0.p120921;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(String A, String B) {
        int answer = 0;

        String newA = A;
        for(int i = 0; i < A.length(); i++){
            if(newA.equals(B))
                return answer;
            String push = newA.substring(newA.length()-1);
            newA = push + newA.substring(0, newA.length()-1);
            answer++;
        }
        return -1;
    }
}