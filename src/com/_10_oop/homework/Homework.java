// package com._10_oop.homework;
//
// /**
//  * 第4题
//  *
//  * @author zxcsjf
//  * @since 2022/06/14 19:33
//  */
//
// /**
//  * 问题1: 思考注释1下面的代码能否放开?会不会报错?
//  *      可以，因为没有创建Homework对象，构造代码块不会执行。不会NPE
//  * 问题2: 思考控制台输出的顺序,提供必要的文字说明解释代码为何如此执行。
//  *
//  * 问题3: Homework building和Homework constructor会不会输出,为什么?
//  *      不会，因为没有创建Homework对象，构造代码块和构造器都不会执行。
//  */
// public class Homework {
//     static Student s = new Student();
//
//     // 2. 不会运行
//     {
//         System.out.println("Homework building");
//         s = null;
//     }
//
//     public static void main(String[] args) {
//         System.out.println("main");
//         // 注释1
//         System.out.println(s.age);
//         Person p = new Person("刘备");
//         System.out.println(p.name);
//     }
//
//     public Homework() {
//         System.out.println("Homework constructor");
//     }
// }
// //
// // class Person {
// //     {
// //         name = "赵云";
// //         System.out.println("Person building");
// //     }
// //
// //     String name = "曹操";
// //     static Student s = new Student();
// //
// //     public Person() {
// //     }
// //
// //     public Person(String name) {
// //         System.out.println("Person constructor");
// //         this.name = name;
// //     }
// // }
//
// class Student {
//     int age = 10;
//
//     {
//         System.out.println("Student building");
//         age = 20;
//     }
//
//     public Student(int age) {
//         this.age = age;
//     }
//
//     public Student() {
//         System.out.println("Student constructor");
//     }
// }
