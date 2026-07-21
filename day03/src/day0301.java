import java.util.Random;
import java.util.Scanner;

public class day0301 {
    static void main() {

        int [][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        for (int i = 0; i < arr.length; i++) {
          int []  brr = arr[i];
          int sum = getSum2(brr);
          System.out.println(sum);


        }

    }
    public static int getSum(int[][] arr) {
        int allsum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                allsum += arr[i][j];
            }
        }

        return allsum;
    }
    public static int getSum2(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
