package com.test.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTest {
    @Test
    public void test1(){

        Assert.assertEquals(1,2);
    }
    @Test
    public void test2() {

        Assert.assertEquals(1, 1);
    }
    @Test
    public void logdemo() {
        Reporter.log("this is a error");
        throw new RuntimeException("This is my run erro");
    }
}
