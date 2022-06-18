package com._14_lambda.homework.solution4;

/**
 * Lambda表达式的练习 提供以下6个功能接口，
 * 请用Lambda表达式分别创建它们的子类对象，
 * 调用test()方法进行测试。
 *  注意：自由发挥方法实现，主要练习Lambda表达式的语法。
 * @author zxcsjf
 * @since 2022/06/18 15:40
 */
public class LambdaDemo {
    public static void main(String[] args) {
        IHasReturnNoParam hrnp = () -> 1;
        System.out.println(hrnp.test());

        IHasReturnOneParam hrop = (a -> a + 1);
        System.out.println(hrop.method(1));

        IHasReturnTwoParam hrtp = (a, b) -> a + b;
        System.out.println(hrtp.test(1, 2));

        INoReturnNoParam nrnp = () -> System.out.println("无返回值，无参数的功能接口。");
        nrnp.test();

        INoReturnOneParam nrop = a -> System.out.println("无返回值，有单参的功能接口 1" + a);
        // 可简化为：
        // INoReturnOneParam nrop = System.out::println;
        nrop.test(4);

        INoReturnTwoParam nrtp = (a, b) -> System.out.println("无返回值，有双参的功能接口 "+(a + b));
        nrtp.test(2, 3);
    }
}

//无返回值无参数的功能接口
@FunctionalInterface
interface INoReturnNoParam {
    void test();
}

//无返回值有一个参数的功能接口
@FunctionalInterface
interface INoReturnOneParam {
    void test(int a);
}

//无返回值两个参数的功能接口
@FunctionalInterface
interface INoReturnTwoParam {
    void test(int a, int b);
}

//有返回值无参数的功能接口
@FunctionalInterface
interface IHasReturnNoParam {
    int test();
}

//有返回值一个参数的功能接口
@FunctionalInterface
interface IHasReturnOneParam {
    int method(int a);
}

//有返回值两个参数的功能接口
@FunctionalInterface
interface IHasReturnTwoParam {
    int test(int a, int b);
}