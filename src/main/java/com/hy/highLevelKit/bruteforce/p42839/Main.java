package com.hy.highLevelKit.bruteforce.p42839;

import java.awt.print.Pageable;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
}
class Solution {
    HashSet<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        //모든 숫자의 조합을 만들어야 함
        number("", numbers);
        //만든 숫자들이 소수인지 판별해야함
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int number = it.next();
            if(isPrime(number)) answer++;
        }
        //소수가 몇 개인지
        return answer;
    }
    public boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        int lim = (int)Math.sqrt(n);
        for(int i = 2; i <= lim; i++){
            if(n % 2 == 0) return false;
        }
        return true;
    }
    public void number(String comb, String others){
        if(!comb.equals("")){
            set.add(Integer.valueOf(comb));
        }
        for(int i = 0; i < others.length(); i++){
            number(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }
}