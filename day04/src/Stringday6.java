import java.util.Scanner;

public class Stringday6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a'&& c <= 'z'){
                smallcount++;
            }
        }

    }
}
