class Calculator{


int num;
    //n1, n2 are local variables
    public  int add(int n1,int n2){
        int r=n1+n2;

        return r;
    }

    public  int add(int n1,int n2,int n3){
        int r=n1+n2+n3;
        return r;
    }

}



public class Demo {

    public static void main(String[] args) {


        int a =10;

    Calculator calc = new Calculator() ;
    int result= calc.add(24,356);
    System.out.println(result);


    int r=calc.add(23,43,12);
        System.out.println(r);


    }
}
