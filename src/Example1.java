
class Computer {


    public void playMusic() {
        System.out.println("Music Playing");

    }

    public String getMeAPen(int cost) {

        if (cost > 10) {
            return "Pen";
        } else {
            return "Nothing";
        }
    }
}
public class Example1 {
    public static void main(String[] args) {

        Computer  com= new Computer();
        com.playMusic();
        String str= com.getMeAPen(32);
        System.out.println(str);

    }
}
