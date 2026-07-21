import java.util.Scanner;

public class StudentTest {
    static void main() {

        Student a = new Student("zhangsan", 1,  23);
        Student b = new Student("lisi", 2, 24);
        Student c = new Student("wangwu", 3, 25);
        Student[] arr = new Student[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        Student d = new Student("zhaoliu", 4, 26);
        boolean a1 = panduan(arr, d.getId());
        if(a1){
            System.out.println("请重新输入学号: ");
        }
        else{
            int count = Cout(arr);
            if(count != arr.length){

                arr[count] = d;
                print(arr);
            }
            else{

                Student [] brr = tianjia(arr);
                brr[count] = d;
                print(brr);
            }

        }
    }
    public static boolean panduan(Student [] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId() == id)
            {
                return true;
            }
        }
        return false;
    }
    public static int Cout(Student [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }
    public static Student[] tianjia(Student [] arr){
        Student [] brr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
    public static void print(Student [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getAge());
            System.out.print(arr[i].getId());
            System.out.print(arr[i].getName());
        }
    }
    public static void delete(int id){

    }
}
