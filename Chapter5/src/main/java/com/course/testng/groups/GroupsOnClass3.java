package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void tec1(){
        System.out.println("GroupOnClass3中的stu1运行~");
    }
    public void tec2(){
        System.out.println("GroupOnClass3中的stu2运行~");
    }
}
