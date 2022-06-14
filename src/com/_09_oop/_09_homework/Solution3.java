package com._09_oop._09_homework;

/**
 * 成员变量：String name，int stuId，String gender，int age，double score（表示学生Java考试成绩）
 * 构造器：无参构造器，全参构造器等，自由发挥。
 * 成员方法：print()，打印对象所有属性的取值。
 * 类定义完毕后，创建五个Student对象存入Student对象数组中，完成以下两个操作：
 * <p>
 * 遍历输出每个学生的属性信息（遍历对象调用print()方法）
 * 求成绩平均值。
 * <p>
 * 注：  数组既可以存储基本数据类型（的值），也可以存储引用数据类型（的引用）。它们的使用没有本质区别。
 * 可以考虑提取方法实现功能，不要把所有代码一股脑写在main方法中。
 *
 * @author zxcsjf
 * @since 2022/06/13 20:01
 */
public class Solution3 {
    public static void main(String[] args) {
        Student s1 = new Student("马运", 1, "男", 35, 60);
        Student s2 = new Student("马花藤", 2, "女", 25, 70);
        Student s3 = new Student("马斯科", 3, "男", 15, 80);
        Student s4 = new Student("马国保", 4, "女", 5, 90);
        Student s5 = new Student("柳强冬", 5, "男", 18, 100);

        Student[] students = {s1, s2, s3, s4, s5};
        double sum = 0;
        for (Student student : students) {
            System.out.println("------------------");
            student.print();
            sum += student.score;
        }
        System.out.println("------------------");
        System.out.println("5名学生的平均分是：" + sum / 5);
    }
}

class Student {
    String name;
    int stuId;
    String gender;
    int age;
    double score;

    public Student(String name, int stuId, String gender, int age, double score) {
        this.name = name;
        this.stuId = stuId;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public void print() {
        System.out.println("姓名：" + this.name);
        System.out.println("学号：" + this.stuId);
        System.out.println("性别：" + this.gender);
        System.out.println("分数：" + this.score);
    }
}
