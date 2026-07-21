public class GameTest {
    static void main() {
        Role r1 = new Role("乔峰", 100, '男');
        Role r2 = new Role("九九", 100, '女');

        while(true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "赢了");
                break;
            }
        }

    }
}
