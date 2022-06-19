package com._14_lambda.test;

/**
 * @author zxcsjf
 * @since 2022/06/19 23:23
 */
public class TestFinalize {
    public static void main(String[] args) throws InterruptedException {
        // 匿名对象,理论上很快成为垃圾对象
        new Student();
        // 通知GC进行垃圾回收
        System.out.println("_________");
        System.gc();
        // Thread.sleep(1000);
    }
}
class Student{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("模拟释放资源");
    }
}