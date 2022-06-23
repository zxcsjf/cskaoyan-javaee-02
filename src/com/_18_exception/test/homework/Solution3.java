package com._18_exception.test.homework;

/**
 * 异常类只是描述异常的信息，但是什么时候产生异常，
 * 怎么处理异常和异常类本身没有关系 分别自定义编译时异常和运行时异常，
 * 在方法中抛出异常，main方法中调用该方法，并处理相应的异常
 *
 * @author zxcsjf
 * @since 2022/06/23 19:34
 */
public class Solution3 {
    public static void main(String[] args) throws CheckableException {
        try {
            test1();
        } catch (CheckableException e) {
            e.printStackTrace();
        }

        try {
            test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test1() throws CheckableException {
        throw new CheckableException("抛出一个CheckedException ！！！");
    }

    public static void test2() {
        throw new MyRuntimeException("抛出一个MyRuntimeException ！！！");
    }

}

class CheckableException extends Exception {
    public CheckableException() {
    }

    public CheckableException(String message) {
        super(message);
    }
}

class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
    }

    public MyRuntimeException(String message) {
        super(message);
    }
}