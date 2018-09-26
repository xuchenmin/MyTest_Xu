package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    /*
    依赖：test1先执行，test2再执行；若test1执行失败，test2不执行
     */
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw  new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
