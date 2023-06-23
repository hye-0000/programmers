package com.hy.highLevelKit.bruteforce.p87946;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] d = {{80,20},{50,40},{30,10}};
        System.out.println("answer: " + solution.solution(80, d));
    }
}

class Solution {
    static int answer = 0;
    static boolean[] visited;
    public void explore(int pi, int[][] dungeon, int depth){
        //모든 던전에 방문
        for(int i = 0; i < dungeon.length; i++){
            int a = dungeon[i][0];
            int b = dungeon[i][1];

            //탐색 가능 여부 확인 -> 방문한 곳인지, 피로도는 괜찮은지
            if(visited[i] || a > pi) {continue;}

            visited[i] = true;
            explore(pi - b, dungeon, depth + 1);
            visited[i] = false;
        }
        answer = Math.max(answer, depth);
    }
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        //모든 던전 탐색
        explore(k, dungeons, 0);
        return  answer;
    }
}