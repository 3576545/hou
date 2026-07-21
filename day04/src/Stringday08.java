import java.util.Scanner;

public class Stringday08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s;
        while (true) {
            s = sc.next();
        if (is(s)) {
            break;
        } else {
            System.out.println("重新输入字符串:");
        }
    }
        StringBuilder m = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int number = c - 48;
            m.append(bian(number));

        }
        System.out.println(m);
    }
    public static boolean is(String s){
        if(s.length() > 9){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
    public static String bian(int b){
        String [] a = { " ", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        return a[b];
    }
}
