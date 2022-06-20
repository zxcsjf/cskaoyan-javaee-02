package com._15_object;

/**
 * @author zxcsjf
 * @since 2022/06/20 11:28
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(new Student(12, 642));
        Student stu1 = new Student(18, 700);
        Object clone = stu1.clone();
        System.out.println(clone == stu1);
        System.out.println(clone.equals(stu1));
    }
}
class Student implements Cloneable {
    int age;
    int score;

    public Student(int age, int score) {
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("age=").append(age);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return score == student.score;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + score;
        return result;
    }
}