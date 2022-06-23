package com._12_.homework.additional2;


/**
 * 2. 将以下代码复制到IDEA中，思考代码为什么会编译报错。然后尝试修改代码，让代码不要报错。
 *
 * > 注：题目2更多是一种语法设置，不需要过分深究。
 * @author zxcsjf
 * @since 2022/06/16 21:41
 */

public class Demo {
    public static void main(String[] args) {
        Student stu = new Student("Bob");
        System.out.println(stu.name);
    }

}

class Student {
    int age = 10;
    String name;
    int var = 100;
    {
        age = 20;
        var = 200;
    }

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        // Cannot reference 'Student.var' before supertype constructor has been called
        // 在调用父类构造函数之前无法引用“Student.var”
        // 如果 构造器传入自身对象，不能传入没有赋值的成员变量，必须
        // 调用构造方法，会运行这一行this(),本构造方法会进栈，
        // 再调用上面的单参构造器，
        // 再隐式调用Object()无参构造器
        // 如果是this(var),
        // var此时还没有显式赋值或者构造代码块赋值,
        // 不能把默认值当参数传递给构造器;
        this(0);
        this.name = name;
    }
}