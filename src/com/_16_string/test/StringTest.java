package com._16_string.test;

// import java.lang.invoke.*;

/**
 * @author zxcsjf
 * @since 2022/06/22 09:47
 */
public class StringTest {
    public static void main(String[] args) throws Throwable {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;

        String x = new String(new char[]{'a', 'b', 'c'}); // 野生的
        String z = x.intern(); // 野生的 x 被复制后加入 StringTable，StringTable 中有了 "abc"
        String y = "abc";

        StringBuilder stringBuilder = new StringBuilder(32);
        //
        // String x = "b";
        // // String s = "a" + x;
        // // 会生成如下等价的字节码
        //
        // // 编译器会提供 lookup，用来查找 MethodHandle
        // MethodHandles.Lookup lookup = MethodHandles.lookup();
        // CallSite callSite = StringConcatFactory.makeConcatWithConstants(
        //         lookup,
        //         // 方法名，不重要，编译器会自动生成
        //         "arbitrary",
        //         // 方法的签名，第一个 String 为返回值类型，之后是入参类型
        //         MethodType.methodType(String.class, String.class),
        //         // 具体处方格式，其中 \1 意思是变量的占位符，将来被 x 代替
        //         "a\1"
        // );
        //
        // // callSite.getTarget() 返回的是 MethodHandle 对象，用来反射执行拼接方法
        // String s = (String) callSite.getTarget().invoke(x);
        // System.out.println(s);
    }
    static String s = "h1h2";
    public static void test2(String[] args) {
        String str = new String("h1") + new String("h2");
        String str2 = str.intern();
        String str3 = "h1h2";
        System.out.println(s == str2);
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str2 == str3);

        // System.out.println(args[0] == s1);


    }
}
