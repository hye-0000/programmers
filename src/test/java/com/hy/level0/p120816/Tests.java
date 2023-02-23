package com.hy.level0.p120816;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("7, 10 => 2")
    void t1(){
        assertThat(new Solution().solution(7, 10)).isEqualTo(10);
    }
}
