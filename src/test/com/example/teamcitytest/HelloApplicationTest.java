package com.example.teamcitytest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest
{
    @Test
    public void test()
    {
        HelloApplication helloApplication = new HelloApplication();
        int result = helloApplication.addNumbers(10, 5);
        assertEquals(15, result);
    }

}