package com.course.testng.groups;

import org.testng.annotations.Test;

import java.lang.management.GarbageCollectorMXBean;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupOnClass1中的stu1运行~");
    }
    public void stu2(){
        System.out.println("GroupOnClass1中的stu2运行~");
    }
}
