import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
//        Car obj = new Car();
//        obj.show_vehicle();
//        obj.show_car_details();


        Scanner scan=new Scanner((System.in));
        System.out.println("Enter the cost");
        int cost=scan.nextInt();


        int mileage=scan.nextInt();
        String color=scan.nextLine();
        int tyres=scan.nextInt();

        Car obj =new Car(cost,tyres,color,mileage);
        obj.show_car_details();

    }
}
