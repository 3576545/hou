package a02;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxage(ArrayList<Student> list){
        int maxage = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() > maxage){
                maxage = list.get(i).getAge();
            }
        }
        return maxage;
    }
}
