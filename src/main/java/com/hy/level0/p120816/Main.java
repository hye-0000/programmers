package com.hy.level0.p120816;

public class Main {
    public static void main(String[] args) {
        new Solution().solution(7, 10);
    }
}

class Solution {
    public int solution(int slice, int n) {
        return (n % slice == 0) ? (n / slice) : (n / slice) + 1;
    }
}