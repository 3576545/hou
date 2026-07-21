import java.util.Scanner;

public class Studentday04 {
    static void main() {
        String rightname = "liu";
        String rightpasswords = "l123456";
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String passwords = sc.next();
        boolean f = login(name,passwords);
        if(f){
            System.out.println("密码正确");
        }
        else{
            System.out.println("密码错误");
        }
    }
    public static boolean login(String name, String passwords){
        boolean c = false;
        boolean d = false;
        if(passwords.equals("l123456")){
            c = true;
        }
        if(name.equals("liu")){
            d = true;
        }
        if(c && d)
        return true;
        else{
            return false;
        }
    }
}
