import java.util.Scanner;

public class StringBuildday8 {
    static void main() {
       int [] a = {1, 2, 3, 4, 5};
        System.out.println(buildString(a));
    }
    public static String buildString(int [] a){
        StringBuilder sc = new StringBuilder();
        sc.append("[");
        for (int i = 0; i < a.length; i++) {
            if(i == a.length - 1){
                sc.append(a[i]).append("]");
            }
            else{
                sc.append(a[i]).append(",");
            }
        }
        return sc.toString();
    }
}
