// constructor
class Calc{
    int num1;
    int num2;
    int result;

    public Calc() {
        num1 = 5;
        num2 = 5;
        result= num1 + num2;
        System.out.println("hello constructor here");
    }
    public Calc(int n ){
        num1 = n;
        num2 = n;
    }
    public Calc(double d, int n) {
        num1 = (int)d;
        num2 = n;
    }


}


public class ObjectDemo2 {
    public static void main(String[] args) {
        Calc obj = new Calc(4.5,8);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
