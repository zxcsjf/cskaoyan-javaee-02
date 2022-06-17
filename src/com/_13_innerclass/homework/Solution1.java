package com._13_innerclass.homework;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * 接口与抽象类基础语法练习
 * 从实际角度出发，接口和抽象类的差异是十分明显的。可以参考完成以下案例：
 * <p>
 * 学生和老师都有共同的属性: name、gender、age
 * 共同的行为：eat() sleep()
 * 注：虽然行为一致，但实现会不同。
 * 现在为了提升自身素质，大家都需要额外进行技能的学习：学生需要增强实践动手能力，老师需要增强语言能力。
 * 请定义抽象类和接口，描述以上体系。
 * ​
 * 然后用以下方式进行测试：
 * 1，用不同的父类指向不同的子类对象，理解方法调用时“编译时看左边”
 * 2，用这些引用调用方法，理解方法调用时“运行时看右边”
 *
 * @author zxcsjf
 * @since 2022/06/17 19:49
 */
public class Solution1 {
    public static void main(String[] args) {
        BasePerson stu = new Student();
        stu.eat();
        stu.sleep();
        ((Student) stu).learning();
        System.out.println("________________________");

        ISkill stu2 = new Student();
        ((Student) stu2).eat();
        ((Student) stu2).sleep();
        stu2.learning();

        System.out.println("________________________");
        BasePerson teacher = new Teacher();
        teacher.eat();
        teacher.sleep();
        ((Teacher) teacher).learning();
    }
}

class Student extends BasePerson implements ISkill {

    @Override
    public void eat() {
        System.out.println("我这个月要吃土了o(╥﹏╥)o");
    }

    @Override
    public void sleep() {
        System.out.println("你这个年纪，你怎么睡得着觉！！！");
    }

    @Override
    public void learning() {
        System.out.println("同学自己写一下试试看就知道了！要多多自己动手操作！！");
    }
}

class Teacher extends BasePerson implements ISkill {

    @Override
    public void eat() {
        System.out.println("走，我带你去教工食堂吃！！！");
    }

    @Override
    public void sleep() {
        System.out.println("同学们，我睡了你们可不能睡！！！");
    }

    @Override
    public void learning() {
        System.out.println("老师需要增强语言表达能力，让学生听的更带劲！！！");
    }
}

abstract class BasePerson {
    public abstract void eat();

    public abstract void sleep();

}

interface ISkill {
    void learning();
}