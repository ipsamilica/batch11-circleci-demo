package com.techcenture.acadey;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {
    @Test
    public void loginPositiveTest(){
        System.out.println("Login Positive Test");
        Assert.assertTrue(false);
    }

    @Test
    public void loginPNegativeTest(){
        System.out.println("Login Negative Test");
    }

    @Test
    public void loginInvalidTest(){
        System.out.println("Login Invalid Test");
    }

}
