package com._15_object.homework;

import java.util.Objects;

/**equals方法练习
 定义一个Animal类
 成员变量：
 int age,String name,double price
 手写它的equals方法，比较getClass和instanceof的区别
 * @author zxcsjf
 * @since 2022/06/20 19:33
 */
public class Solution3 {
    public static void main(String[] args) {
        Animal a1 = new Animal(10, "xxx", 0.099999999999999999);
        Animal a2 = new Animal(10, "xxx", 0.1);
        Animal a3 = new Animal(20, "yyy", 128);

        System.out.println(a1.equals(a2));
        System.out.println(a3.equals(a2));
    }
}

class Animal {
    int age;
    String name;
    double price;

    public Animal(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (Double.compare(animal.price, price) != 0) return false;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        result = 31 * result + name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // @Override
    // public boolean equals(Object o) {
    //     // 比较this 和 o 的内容是否相等
    //     // 1. 如果o和this的引用指向同一个地址，说明就是同一个对象
    //     if (o == this) {
    //         return true;
    //     }
    //     // 2. 如果getClass返回值不同，说明肯定不相等
    //     if (o == null || o.getClass() != this.getClass()) {
    //         return false;
    //     }
    //     // if (!(o instanceof Animal)) {
    //     //     return false;
    //     // }
    //     // 3. 运行到这里，说明类型相同，可以强转
    //     Animal oa = (Animal)o;
    //     //     不要在一个if里面写太多判断
    //     if (age != oa.age) {
    //         return false;
    //     }
    //     //     double类型，为了防止非规格化浮点数和NaN，
    //     //     用Double.compare方法来比较浮点数的二进制位
    //     if (Double.compare(price, oa.price) != 0) {
    //         return false;
    //     }
    //     return this.name.equals(oa.name);
    // }
}