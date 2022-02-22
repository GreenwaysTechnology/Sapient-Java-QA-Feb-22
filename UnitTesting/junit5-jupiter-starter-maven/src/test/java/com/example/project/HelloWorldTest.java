package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    //Test cases
    @Test
    @DisplayName("hello") // for title of the test case; if ignore this , method name will be title
    public void testHelloWorld() {
        //assertions
        String expected = "HelloWorld";
        Greeting greeting = new Greeting("HelloWorld");
        String actual = greeting.sayHello();
        //match
        //Assertions.assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Whether two Greetings Objects are equal or not")
    public void testGreetingEquals() {
        Greeting greeting1 = new Greeting("Hello");
        Greeting greeting2 = new Greeting("Hai");
        assertThat(greeting1, equalTo(greeting2));

    }

}
