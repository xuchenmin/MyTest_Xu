package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.print("IgnoreTest 执行.......");
    }
    @Test (enabled = false)
    public void ignore2(){
        System.out.print("IgnoreTest 不想执行.......");
    }
}

