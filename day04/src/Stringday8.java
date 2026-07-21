import java.util.Scanner;

public class Stringday8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        String [] arr = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};
        String s = "";
        int count = 0;
        while(a != 0){
            int c = a % 10;
            s = arr[c] + s;
            a /= 10;
            count++;
        }
        int remain = 7 - count;
        String l = "";
        for (int i = 0; i < remain; i++) {
            l += "零";
        }
        String result = l + s;
        System.out.println(result);
    }
}
