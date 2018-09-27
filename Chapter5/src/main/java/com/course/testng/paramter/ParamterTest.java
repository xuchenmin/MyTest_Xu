package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramterTest1(String name,int age){
        System.out.println("\nThe person's name is:" + name + "\nThe age is " + age+" years old.");
    }
}
