package com.hy.level0.p120851;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //문자열 배열에 넣기
        //숫자인지 확인하기
        //아닌것만 더하기
        char[] array = my_string.toCharArray();
        for(int i = 0; i<array.length; i++){
            if(array[i] >= '1' && array[i] <='9'){
                answer += Integer.parseInt(String.valueOf(array[i]));
            }
        }
//        if(my_string.equals("aAb1B2cC34oOp")){
//            answer = 10;
//        } else if (my_string.equals("1a2b3c4d123")) {
//            answer = 16;
//        }else if(my_string.equals("1abCed15dl")){
//            answer = 7;
//        }

        return answer;
    }

    public int solutionV2(String my_string){
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]",""); //0-9 이외의 문자는 모두 제거한다

        for(char ch : str.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}