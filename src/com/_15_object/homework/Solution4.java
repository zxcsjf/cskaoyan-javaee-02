package com._15_object.homework;

import java.sql.Statement;

/**
 * 深度克隆练习 注:String虽然也是引用数据类型，但无需考虑它的深度克隆。
 * 分别定义以下类：
         * 教师类Teacher  属性：int age;String name;Student stu
         * 学生类Student  属性：int age；String name；Star s
         * 明星类Star  属性：int age，String name  ​
 *
 * 尝试完成Teacher对象的深度克隆，并写代码进行测试
 *
 * @author zxcsjf
 * @since 2022/06/20 20:08
 */
public class Solution4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher t1 = new Teacher(18, "长风老师", new Student(28, "单纪飞", new Star(35, "Mathieu van der Poel")));
        Teacher cloneTeacher = t1.clone();
        cloneTeacher.age = 28;
        cloneTeacher.stu.age = 38;
        cloneTeacher.stu.s.name = "MVDP";
        System.out.println(t1.age);
        System.out.println(cloneTeacher.age);
        System.out.println(t1.stu.s.name);
        System.out.println(cloneTeacher.stu.s.name);
    }
}

class Teacher implements Cloneable {
    int age;
    String name;
    Student stu;

    public Teacher(int age, String name, Student stu) {
        this.age = age;
        this.name = name;
        this.stu = stu;
    }

    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        // 1.深度克隆是在浅克隆的基础上完成的
        Teacher cloneTeacher = (Teacher)super.clone();
        // 2.克隆一份对象中引用指向的对象
        Student cloneStudent = this.stu.clone();
        // 3.让克隆引用,指向克隆对象
        cloneTeacher.stu = cloneStudent;
        return cloneTeacher;
        // return super.clone();
    }
}

class Student implements Cloneable {
    int age;
    String name;
    Star s;

    public Student(int age, String name, Star s) {
        this.age = age;
        this.name = name;
        this.s = s;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        // 1.深度克隆是在浅克隆的基础上完成的
        Student cloneStudent = (Student) super.clone();
        // 2.克隆一份对象中引用指向的对象
        Star cloneStar = s.clone();
        // 3.让克隆引用,指向克隆对象
        cloneStudent.s = cloneStar;
        return cloneStudent;
    }
}

class Star implements Cloneable {
    int age;
    String name;

    public Star(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected Star clone() throws CloneNotSupportedException {
        // 1.深度克隆是在浅克隆的基础上完成的
        return (Star) super.clone();
    }
}