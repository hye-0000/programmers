package com.hy.level0.p120890;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int[] array, int n) {
        int idx = 0;

        for(int i = 0; i < array.length - 1; i++){
            if(Math.abs(n-array[idx]) > Math.abs(n-array[i+1])){
                idx = i + 1;
            }else if(Math.abs(n-array[idx]) < Math.abs(n-array[i+1])){
                continue;
            }else{
                if(array[idx] > array[i+1]){
                    idx = i + 1;
                }
                continue;
            }
        }
        return array[idx];
    }

}
