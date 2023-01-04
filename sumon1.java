class constructor{

    int num1;
    int num2;

    public constructor(){
        System.out.println("Hello everyone");
    }
    // create a parameter constructor 
    public constructor(double d){
        num1 = (int)d;
    }
    public constructor(double d,int n){
        num1 = (int)d;
        num2 = n;

    }
}

public class sumon1 {
    public static void main(String[] args) {
        constructor obj = new constructor(5.5,50);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }

}
