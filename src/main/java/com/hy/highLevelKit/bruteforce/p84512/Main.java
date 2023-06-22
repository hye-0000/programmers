package com.hy.highLevelKit.bruteforce.p84512;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                Solution solution = new Solution();
                String word = "AEI";
                int answer = solution.solution(word);
                System.out.println("Answer: " + answer);
        }
}
class Solution {
        static String[] arr;
        static List<String> list;
        public int solution(String word) {
                int answer = 0;

                list = new ArrayList<>();
                arr = new String[]{"A", "E", "I", "O", "U"};
                // 완전탐색 메서드 호출
                recursion(word, "", 0);

                // 선형 탐색
                for (int i = 0; i < list.size(); i++) {
                        if(list.get(i).equals(word)) {
                                answer = i;
                                break;
                        }
                }
                return answer;
        }

        // 완전탐색 메서드
        static void recursion(String word, String str, int depth) {
                System.out.println("Before/" + depth + ": " + list); // recursion 호출 전에 list 출력
                list.add(str);
                System.out.println("Added str: " + str); // str 값 출력
                if (depth == 5) return;
                for (int i = 0; i < arr.length; i++) {
                        recursion(word, str + arr[i], depth + 1);
                }
                System.out.println("After: " +  list); // recursion 호출 후에 list 출력
        }
}