public class Nimal extends  Kamal {


    @Override
    void run() {
        System.out.println("hello");
    }

    void drink(){

        System.out.println("drinking");
    }
    public static void main(String[] args) {
        Nimal obj1 = new Nimal();
        obj1.drink();

        Nimal obj2=new Nimal();
        obj2.run();
        obj2.eat();
    }

}
