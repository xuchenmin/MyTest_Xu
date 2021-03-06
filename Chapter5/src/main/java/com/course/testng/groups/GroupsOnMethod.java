package com.course.testng.groups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class GroupsOnMethod {
    @Test(groups ="service")
    public void test1(){
        System.out.println("这是服务端的测试方法1");
    }
    @Test(groups = "service")
    public void test2(){
        System.out.println("这是服务端的测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试方法4");
    }
    @BeforeGroups("service")
    public void beforeGroupsOnService(){
        System.out.println("BeforeGroups：这是服务端组运行之前的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("BeforeGroups：这是客户端组运行之前的方法");
    }
    @AfterGroups("service")
    public void afterGroupsOnService(){
        System.out.println("AfterGroups：这是服务端组运行之后的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("AfterGroups：这是客户端组运行之后的方法");
    }
}
