package com.hy.level0.p120906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1234를 넣었을 때 결과 값은 1")
    void t1(){
        assertThat(new Solution().solution(1234)).isEqualTo(10);
    }

}
