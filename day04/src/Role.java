import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String [] attacks = {"%s使出一招钉子， 一掌向%s背心的穴拍去","%s使出一招探爪， 抓向%s","%s大喝一声， 捶向%s"};
    String [] boyface = {"风流倜傥", "气宇轩昂", "五官端正", "一塌糊涂"};
    String [] girlface = {"美轮美奂", "沉鱼落雁", "亭亭玉立", "相貌平平"};

    public Role() {
    }

    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getFace() {
        return face;
    }



    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void attack(Role role){
        Random r = new Random();
        int index = r.nextInt(3);
        String kungfu = attacks[index];
        int hurt = r.nextInt(12) + 1;
        int remainblood = role.getBlood () - hurt;
        remainblood = remainblood < 0 ? 0 : remainblood;
        role.setBlood(remainblood);

        System.out.println(this.getFace() + "的" + this.getName() + "的" + role.getName() + "一拳" + "造成了" + hurt + "点伤害" + "剩余血量为" + role.getBlood());
    }
    public void setFace(char gender){
        Random r = new Random();
        int index = r.nextInt(4);
        if(gender == '男'){
            this.face = boyface[index];

        }
        if(gender == '女'){
            this.face = girlface[index];
        }
    }
}
