package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Skip Tests")
//@Disabled
public class SkippingTest {

    @Disabled("Disabled until bug #42 has been resolved")
    @Test
    @DisplayName("doStuff method")
    public void doStuff(){
        Assertions.assertEquals("hello","hai");
    }
    @Test
    @DisplayName("doStuff2 method")
    public void doStuff2(){
        Assertions.assertEquals("welcome","welcome");

    }
}
