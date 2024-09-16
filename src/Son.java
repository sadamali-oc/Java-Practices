



public class Son  implements  Father,Mother{

    @Override
    public void show() {
        System.out.println("Blance amount is 540000/=");

    }

    public static void main(String[] args) {
        Son a=new Son();
        a.show();
    }

}
