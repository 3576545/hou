public class Stringday7 {
    static void main() {
        int []a = {1, 2, 3};
        reverse(a);
    }
    public static void reverse(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1)
            System.out.print(arr[i] + ",");
            else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }
}
