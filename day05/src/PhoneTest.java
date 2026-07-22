import java.util.ArrayList;

public class PhoneTest {
    static void main() {
        ArrayList<Phone> list = new ArrayList<>();
        Phone a = new Phone("小米", 1000);
        Phone b = new Phone("苹果", 8000);
        Phone c = new Phone("锤子", 2999);
        list.add(a);
        list.add(b);
        list.add(c);
        ArrayList<Phone> list2 = getList(list);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).getBrand() + ", " + list2.get(i).getPrice());
        }

    }
    public static ArrayList<Phone> getList(ArrayList<Phone> list){
        ArrayList<Phone> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() < 3000){
                System.out.println(list.get(i).getBrand() + list.get(i).getPrice());
                list2.add(list.get(i));
            }
        }
        return list2;
    }
}
