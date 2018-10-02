package com.course.testng;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoReporter {
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
        Reporter.log("this is error");
        throw new RuntimeException("This is my run erro");
    }
}
