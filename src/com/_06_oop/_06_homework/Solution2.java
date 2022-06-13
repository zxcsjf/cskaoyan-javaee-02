package com._06_oop._06_homework;

/**
 * 定义一个Teacher类： 包含4个成员变量 String name, int age, String gender, int teacherId
 * 然后定义5个构造方法：
 * 无参构造
 * name单参构造方法
 * name和teacherId双参构造方法
 * name，age和gender的三参构造器
 * name，age，gender和teacherId的四参构造器（要求用this调用已存在的三参构造器）
 * 最后再定义一个成员方法：
 * print()：用于打印这个Teacher类对象的基本信息。
 * <p>
 * 回答下列问题：  在
 * 上面5个构造方法的基础上，再定义一个构造方法单独给gender赋值，能够做到吗？为什么？
 * 定义完上述结构后，再定义一个成员方法setGender，用于给gender赋值。要求方法的形参就是String gender，这个方法如何写呢？
 * 定义完这个类后，创建两个Teacher对象分别为t1和t2
 * t1："张三"、18、"男"、 1
 * t2："李四"、25、"女"、 2
 * 最后分别用两个对象调用print方法，两次调用方法输出的结果相同吗？为什么？
 *
 * @author zxcsjf
 * @since 2022/06/11 16:18
 */
public class Solution2 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("张三", 18, "男", 1);
        Teacher t2 = new Teacher("李四", 25, "女", 2);
        t1.print();
        t2.print();
    }
}

class Teacher {
    String name;
    int age;
    String gender;
    int teacherId;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
    }

    public Teacher(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Teacher(String name, int age, String gender, int teacherId) {
        this(name, age, gender);
        this.teacherId = teacherId;
    }

    public void print() {
        System.out.println(
                "这位教师姓名：" + name +
                        "、年龄：" + age +
                        "、性别：" + gender +
                        "、工号：" + teacherId);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}