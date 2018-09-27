package com.course.testng.multithread;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class MultiThreadOnAnnu {
    @Test(invocationCount = 10,threadPoolSize = 5)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread ID: %s%n",Thread.currentThread().getId());
    }
}
