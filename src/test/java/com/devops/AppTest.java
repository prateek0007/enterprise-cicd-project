package com.devops;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void getMessageReturnsExpectedMessage() {
        App app = new App();

        assertEquals(
            "CI/CD Build Successful", 
             app.getMessage());
    }
}