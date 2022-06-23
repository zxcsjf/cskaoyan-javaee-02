package com._15_object;

import java.util.stream.Stream;

/**
 * @author zxcsjf
 * @since 2022/06/20 20:50
 */
public class LambdaMapDemo {
    public static void main(String[] args) {
        Student[] arr1 = new Student[5];
        arr1[0] = new Student(18, 100);
        arr1[1] = new Student(28, 90);
        arr1[2] = new Student(38, 80);
        arr1[3] = new Student(48, 70);
        arr1[4] = new Student(58, 60);
        Object[] result1 = mappingObjectArrByIMap(arr1, o -> ((Student) o).getScore());
        for (Object ele : result1) {
            System.out.println(ele);
        }

        Stream<Student> stream = Stream.of(arr1);
        stream.filter(student -> student.getScore() > 60)
                .forEach(student -> System.out.println(student.getScore()));
    }

    public static Object[] mappingObjectArrByIMap(Object[] target, IMap map) {
        // 映射后的数组和原先的数组应该是长度一致的
        Object[] result = new Object[target.length];
        int newIndex = 0;
        for (Object ele : target) {
            result[newIndex] = map.convert(ele);
            newIndex++;
        }
        return result;
    }
}

@FunctionalInterface
interface IMap {
    Object convert(Object o);
}

class Student {
    private int age;
    private double score;

    public Student() {
    }

    public Student(int age, double score) {
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }
}