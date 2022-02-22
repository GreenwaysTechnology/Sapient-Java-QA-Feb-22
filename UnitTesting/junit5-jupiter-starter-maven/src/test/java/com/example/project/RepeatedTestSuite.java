package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

@DisplayName("Repeate Test")
public class RepeatedTestSuite {

    @RepeatedTest(10)
    public void runMore() {
        Assertions.assertEquals(1, 1);
    }
}
