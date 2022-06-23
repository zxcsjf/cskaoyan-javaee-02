package com._16_string.homework;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 编写一个Cat类
 * 成员变量：  int age，  String name，  double price
 * 按以下要求进行自然排序：
 * 1，直接实现Comparable接口，按照年龄的从小到大对Cat数组进行自然排序
 * 2，利用Comparator接口，用 匿名内部类和lambda分别对Cat数组进行自然排序
 * 1，按照price的大到小排序
 * 2，name的长短排序，name越长对象越大
 * 3，综合age，name，price进行排序，
 * 要求用lambda表达式指向一个方法。
 * 排序的规则是age越小对象越小，
 * age相同比较name长短，
 * name越短对象越小，
 * name长度也相等，
 * 比较price，price越大对象越小
 *
 * @author zxcsjf
 * @since 2022/06/21 19:49
 */
public class Solution5 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(6, "dahei", 180.0);
        Cat cat2 = new Cat(6, "dahei", 200.0);
        Cat cat3 = new Cat(6, "xiaohuang", 120);
        Cat cat4 = new Cat(5, "dahuang", 120);
        Cat cat5 = new Cat(3, "dahuang", 150);
        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};
        // 1. 自然排序
        // Arrays.sort(cats);

        // 2. 匿名内部类,按照价格从高到低排序
        Arrays.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });

        // 3. Lambda表达式,按照价格从高到低排序
        Arrays.sort(cats, (o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));

        // 4. 匿名内部类, name的长短排序，name越长对象越大
        Arrays.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });

        // 5. Lambda表达式, name的长短排序，name越长对象越大
        Arrays.sort(cats, (o1, o2) -> o1.getName().length() - o2.getName().length());

        // 6. 综合age，name，price进行排序，
        //  *  要求用lambda表达式指向一个方法。
        //  *  排序的规则是age越小对象越小，
        //  *  age相同比较name长短，
        //  *  name越短对象越小，
        //  *  name长度也相等，
        //  *  比较price，price越大对象越小
        Arrays.sort(cats, (o1, o2) -> compareMethod6(o1, o2));

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    private static int compareMethod6(Cat o1, Cat o2) {
        // age越小对象越小
        if (o1.getAge() != o2.getAge()) {
            return o1.getAge() - o2.getAge();
        }
        // 运行到这里，说明age相同
        // 比较name长度，name越短对象越小
        if (o1.getName().length() != o2.getName().length()) {
            return o1.getName().length() - o2.getName().length();
        }
        // 运行到这里，说明name长度相同
        // 比较price，price越大对象越小
        return (int) (o2.getPrice() - o1.getPrice());
    }
}

class Cat implements Comparable<Cat> {
    private int age;
    private String name;
    private double price;

    public Cat(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cat{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}