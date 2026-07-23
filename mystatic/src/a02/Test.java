package a02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static void main() {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 23, "男");
        Student stu2 = new Student("李四", 26, "男");
        Student stu3 = new Student("王五", 25, "男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxage = StudentUtil.getMaxage(list);
        System.out.println(maxage);
    }
}
