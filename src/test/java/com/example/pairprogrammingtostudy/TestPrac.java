package com.example.pairprogrammingtostudy;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPrac {

    @Test
    @DisplayName("문자열 속에 찾는 문자가 있는가")
    public void containsTest() {
        Assertions.assertTrue(StringUtils.contains("abcdefghijk", "abc"));
        Assertions.assertFalse(StringUtils.contains("abcdefg", "hijk"));
    }

}
