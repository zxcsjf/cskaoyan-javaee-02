// package com._09_oop._09_homework;
//
// /**
//  * Debug模式练习，提供几个代码案例，请自行debug查看变量赋值顺序：
//  *
//  * @author zxcsjf
//  * @since 2022/06/13 19:04
//  */
// public class Solution1 {
//     public static void main(String[] args) {
//         // Student student1 = new Student();
//         // student1.age = 19;
//         // student1.name = "李四";
//
//         Student student2 = new Student(23, "单纪飞");
//         System.out.println(student2.age);
//         //
//         // Student student3 = new Student(14);
//         // student3.name = "佐仓杏子";
//         // System.out.println(student3.name);
//     }
//
// }
//
// class Student {
//     int age = 10;
//     String name = "张三";
//     double a = 100;
//
//     public Student() {
//         System.out.println("自己写的无参构造器。");
//     }
//
//     public Student(int age) {
//         System.out.println("Student age");
//         this.age = age;
//     }
//
//     public Student(int age, String name) {
//         this(age);
//         System.out.println("Student age,name");
//         this.name = name;
//     }
// }
