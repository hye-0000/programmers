package com.hy.level0.p120886;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(String before, String after) {
        //문자열을 정렬한다 -> 두 문자열이 같으면 순서를 바꿔서 after를 만들 수 있다
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = new String(arr1);
        String str2 = new String(arr2);

        return str1.equals(str2) ? 1 : 0;
    }
}