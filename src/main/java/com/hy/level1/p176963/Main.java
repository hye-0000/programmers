package com.hy.level1.p176963;

import java.util.HashMap;

public class Main {
}

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map1 = new HashMap<>();
        int[] answer = new int[photo.length];

        for(int i = 0; i < name.length; i++){
            map1.put(name[i], yearning[i]);
        }

        for(int i = 0 ; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                if(map1.containsKey(photo[i][j])) answer[i] += map1.get(photo[i][j]);
            }
        }

        return answer;
    }
}