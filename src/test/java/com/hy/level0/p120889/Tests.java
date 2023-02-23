package com.hy.level0.p120889;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("199, 72, 222를 넣었을 때 결과 값은 1")
    void t1(){
        assertThat(new Solution().solution(new int[]{199, 72, 222})).isEqualTo(1);
    }

}
