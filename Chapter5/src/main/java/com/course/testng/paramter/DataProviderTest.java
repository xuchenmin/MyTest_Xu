package com.course.testng.paramter;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = " + name +"\nage = " + age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o= new Object[][]{
                {"xu",13},
                {"wang",15},
                {"Ma",18}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("Test1方法：name = " + name +"\nage = " + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("Test2方法：name = " + name +"\nage = " + age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method  method){
        Object[][] result =null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"Zhang",13},
                    {"Wang",11}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"XU",16},{"Li",20}
            };
        }
        return result;
    }
}

