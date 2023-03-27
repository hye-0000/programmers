package com.hy.level0.p120888;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.indexOf(my_string.charAt(i)) == i)
                answer += my_string.charAt(i);
        }
        return answer;
    }
}