package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Parametermize")
public class ParamerimizedTestSuite {
    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba","subramanian"})
    void palindromes(String candidate) {
        System.out.println(candidate);
        assertTrue(StringUtils.isPalindrome(candidate));
    }
}
