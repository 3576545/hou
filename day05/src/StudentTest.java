import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    static void main() {
        ArrayList <Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("请输入学生1的年龄和姓名：");
        s1.setAge(sc.nextInt());
        s1.setName(sc.next());
        Student s2 = new Student();
        System.out.println("请输入学生2的年龄和姓名：");
        s2.setAge(sc.nextInt());
        s2.setName(sc.next());
        list.add(s2);
        list.add(s1);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getAge()+stu.getName());
        }
    }
}
