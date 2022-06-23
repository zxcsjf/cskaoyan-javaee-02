package com._18_exception.test;

/**
 * @author zxcsjf
 * @since 2022/06/23 10:54
 */
public class MyExceptionTest {
    public static void main(String[] args) {
        MyException myException = new MyException("我自己定义的异常。");
        System.out.println(myException.getMessage());
        throw myException;
    }
}

class MyException extends RuntimeException {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}