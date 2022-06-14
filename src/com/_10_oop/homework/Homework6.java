// package com._10_oop.homework;
//
// /**
//  * 综合访问权限修饰符，static等知识点，做一个综合的练习。
//  * <p>
//  * 定义一个Student类，并要求在其他类中，最多只能创建10个Student类的对象。
//  * * <p>
//  * 分析：
//  * 1，如果允许外部直接创建对象，显然无法控制创建对象的个数
//  * 2，需要计数器指示外部创建对象的个数
//  * <p>
//  * 注意: 该题目具有一定综合性 如果一时想不明白 可最后做!
//  *
//  * @author zxcsjf
//  * @since 2022/06/14 20:53
//  */
// public class Homework6 {
//     public static void main(String[] args) {
//         // 会返回提示信息：不能再创建学生对象了！
//         for (int i = 0; i < 13; i++) {
//             System.out.println(com._10_oop.homework.liubei.Student.createStudent("张三", 23).getAge() + "岁。");
//         }
//     }
// }
//
// class Student {
//    private static int count = 0;
//    private String name;
//    private int age;
//
//     // 禁止构造方法
//     private Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//
//     static com._10_oop.homework.liubei.Student createStudent(String name, int age) {
//         if (count >= 10) {
//             System.out.println("不能再创建学生对象了！");
//             return null;
//         }
//         count++;
//         System.out.println("这是你创建的第" + count + "个学生。");
//         return new com._10_oop.homework.liubei.Student(name, age);
//     }
//
//     public String getName() {
//         return name;
//     }
//
//     public void setName(String name) {
//         this.name = name;
//     }
//
//     public int getAge() {
//         return age;
//     }
//
//     public void setAge(int age) {
//         this.age = age;
//     }
// }