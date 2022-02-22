package com.example.project;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Greeting Test Suite")
public class GreetingLifeTests {
    Greeting greeting1;
    Greeting greeting2;

    @BeforeAll
    static void initAll() {
        System.out.println("init one time");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Clean is called one time");
    }

    @BeforeEach
    @DisplayName("init is called every time")
    public void init() {
        System.out.println("Which is called for every test case");
        greeting1 = new Greeting("hello");
        greeting2 = new Greeting("hello");
    }

    //Test
    @Test
    @DisplayName("It should return hello")
    public void testHello() {
        assertEquals("hello", greeting1.sayHello());
    }

    @Test
    @DisplayName("Whether two Greetings Objects are equal or not")
    public void testGreetingEquals() {
        assertThat(greeting1, equalTo(greeting2));
    }

    //tearDown : for clean up actitivy
    @AfterEach
    void tearDown() {
        System.out.println("Cleaning for every test case");
        greeting1 = null;
        greeting2 = null;
    }
}
