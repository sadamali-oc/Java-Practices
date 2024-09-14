public class Vehicle {

    int cost =0;
    int mileage=0;


    public  Vehicle(int c,int m) {

        cost = c;
        mileage=m;

    }

    public  void show_vehicle (){
        System.out.println("I am a vehicle");
        System.out.println("The cost of the vechicle is: "+ cost);
        System.out.println("The mileage of the vehicle is " + mileage);
    }
}
