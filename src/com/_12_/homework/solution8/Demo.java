package com._12_.homework.solution8;

import java.time.Period;

/**
 * 请根据题目，作出合理设计，定义如下类：
 * 父类Person
 * 属性：String name，int age
 * 行为：eat();
 * <p>
 * 子类SouthPerson
 * 属性：String name，int age，double salary
 * 行为：eat()，swim()
 * ​
 * 子类NorthPerson
 * 属性：String name，int age，double height
 * 行为：eat()，drink()
 * ​
 * 写代码实现，eat()方法的多态效果
 * 1，人都要吃饭
 * 2，南方人喜欢吃米饭
 * 3，北方人喜欢吃面食
 *
 * @author zxcsjf
 * @since 2022/06/16 20:54
 */
public class Demo {
    public static void main(String[] args) {
        /*
        最后，在测试类中，编写测试代码，要求进行如下测试：
 *       1，编写测试方法，
 *       要求该方法允许传入SouthPerson对象和NorthPerson对象，并在方法体中调用它们的eat()方法
 *         方法调用的结果不一致？
         */
        Test t = new Test();
        t.test(new NorthPerson());
        t.test(new SouthPerson());
        t.test(new Person());
        /*
        2，用父类引用指向子类对象的方式创建SouthPerson对象，能否直接访问salary属性和swim()方法？
 *       如果不能，应该怎么写代码让它能够正常调用？
 *       强制类型转化
         */
        Person p = new SouthPerson();
        // p.salary;
        // p.swim();
        System.out.println(((SouthPerson) p).salary);
        ((SouthPerson) p).swim();

        /*
         3，用父类引用指向子类对象的方式创建NorthPerson对象，能否（直接或写代码）访问salary属性和swim()方法？
                不行
            * 如果不能，将该对象引用强转为SouthPerson引用，能否成功？为什么？
            * 不行！！！因为NorthPerson对象不存在salary属性和swim()方法，不能强制类型转化，也不是 同一条继承链上的。
         */
        Person pn = new NorthPerson();
        // pn.salary
        // pn.swim
        // (SouthPerson)pn.swim();

    }
}
class Test {
@org.junit.Test
    public void test(Person p) {
        p.eat();
    }
}

class Person {
    String name = "人";
    int age = 18;

    public void eat() {
        System.out.println("人都要吃饭");
    }
}

class NorthPerson extends Person {
    String name = "北方人";
    int age = 28;
    double height = 1.80;

    @Override
    public void eat() {
        System.out.println("北方人喜欢吃面食");
    }

    public void drink() {
        System.out.println("北方人会喝酒！");
    }
}

class SouthPerson extends Person {
    String name = "南方人";
    int age = 38;
    double salary = 10_000;

    @Override
    public void eat() {
        System.out.println("南方人喜欢吃米饭");
    }

    public void swim() {
        System.out.println("南方人会游泳！");
    }
}

