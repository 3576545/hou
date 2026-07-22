import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Student1Test1 {
    static void main() {
        ArrayList<Student1> list = new ArrayList<>();
        loop:while(true)  {
            System.out.println("------------欢迎来到学生管理系统------------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出");
            System.out.println("请输入你的选择: ");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> add(list);
                case "2" -> del(list);
                case "3" -> update(list);
                case "4" -> query(list);
                case "5" -> {
                    System.out.println("谢谢使用");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    public static void add(ArrayList<Student1> list) {
        Scanner sc = new Scanner(System.in);
        Student1 stu = new Student1();
        while(true) {
            System.out.println("输入id： ");
            int id = sc.nextInt();
            boolean c = contains(list, id);
            if (c) {
                System.out.println("id已经存在请重新录入id: ");
            }
            else{
                stu.setId(id);
                break;
            }
        }
        System.out.println("输入名字: ");
        String name = sc.next();
        stu.setName(name);
        System.out.println("输入年龄: ");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.println("输入地址: ");
        String address = sc.next();
        stu.setAddress(address);
        list.add(stu);
        System.out.println("学生信息添加成功");
    }
    public static boolean contains(ArrayList<Student1> list, int id){
        boolean c = false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                c = true;
            }
        }
        return c;
    }
    public static void del(ArrayList<Student1> list){
        System.out.println("请输入要删除的id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        boolean c = false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                list.remove(list.get(i));
                c = true;
            }
        }
        if(!c) System.out.println("没有这个学生");
    }
    public static void update(ArrayList<Student1> list){
        System.out.println("请输入要修改的学生id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        boolean c = false;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                c = true;
                index = i;
            }
        }
        if(!c){
            System.out.println("没有这个id");
            return;
        }
        Student1 stu = list.get(index);
        System.out.println("请输入要修改的学生姓名");
        stu.setName(sc.next());
        System.out.println("请输入学生年龄: ");
        stu.setAge(sc.nextInt());
        System.out.println("请输入学生家庭住址: ");
        stu.setAddress(sc.next());
        System.out.println("学生信息修改成功！");

    }
    public static void query(ArrayList<Student1> list){
        if(list.size() == 0){
            System.out.println("当前无学生信息");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" + list.get(i).getAddress());

        }
    }
}
