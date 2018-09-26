package com.course.testng;

import org.testng.annotations.*;

public class BasicAnno {
    @Test///基本注解，把方法作为测试的一部分
    public void testCase1(){
        System.out.println("This is the test case 1");
    }
    @Test///基本注解，把方法作为测试的一部分
    public void testCase2(){
        System.out.println("This is the test case 1");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("run before the method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("run after the method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("run before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("run after class");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("run before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("run after suite");
    }
}
