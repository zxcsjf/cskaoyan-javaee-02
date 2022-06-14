// package com._10_oop.homework;
//
// import java.util.Scanner;
//
// /**
//  * 工具类不需要创建对象，应该私有化构造方法
//  * <p>
//  * 定义一个Scanner工具类ScannerUtils，提供以下方法：
//  * 1，键盘录入字符串
//  * 2，键盘录入int整数
//  * 3，键盘录入一个Person对象（Person类中有age和name属性）
//  * 不要忘记私有化构造器
//  * <p>
//  * 注：录入对象，无非就是先录入成员变量取值，然后再用构造器创建对象。
//  * <p>
//  * 特别提醒:这个工具类中肯定需要一个Scanner对象用于键盘录入 那么这个变量应该是一个什么变量呢?
//  *
//  * @author zxcsjf
//  * @since 2022/06/14 19:44
//  */
// public class Homework5 {
//     public static void main(String[] args) {
//         System.out.println(ScannerUtils.enterString());
//         System.out.println(ScannerUtils.enterInt());
//         System.out.println(ScannerUtils.getPersonInstanceByScanner().getAge());
//     }
// }
//
// class ScannerUtils {
//     // 全局唯一
//     static Scanner sc = new Scanner(System.in);
//
//     // 私有化构造器
//     private ScannerUtils() {
//     }
//
//     // 工具类 public，到处都能访问
//     public static String enterString() {
//         System.out.println("请输入字符串：");
//         return sc.nextLine();
//     }
//
//     public static int enterInt() {
//         System.out.println("请输入int整数：");
//         return Integer.parseInt(sc.nextLine());
//     }
//
//     public static com._10_oop.homework.liubei.Person getPersonInstanceByScanner() {
//         System.out.println("现在开始键盘录入一个Person对象！");
//         System.out.println("请输入Person对象的name：");
//         String name = sc.nextLine();
//
//         System.out.println("请输入Person对象的age：");
//         int age = Integer.parseInt(sc.nextLine());
//
//         com._10_oop.homework.liubei.Person p = new com._10_oop.homework.liubei.Person(age, name);
//         System.out.println("Person对象创建完毕！");
//         return p;
//     }
// }
//
// class Person {
//     private int age;
//     private String name;
//
//     public Person(int age, String name) {
//         this.age = age;
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
//
//     public String getName() {
//         return name;
//     }
//
//     public void setName(String name) {
//         this.name = name;
//     }
// }