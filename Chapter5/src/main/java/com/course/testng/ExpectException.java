package com.course.testng;

import org.testng.annotations.Test;

public class ExpectException {
    /**
     * 什么时候用到异常测试
     * 在我们期望结果为某一个异常的时候
     * 比如我们传入了某些不合法的参数，程序抛出异常
     * 预期结果就是这个异常
     */
    /* 这是一个测试结果为失败的异常 */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw  new RuntimeException();
    }
}
