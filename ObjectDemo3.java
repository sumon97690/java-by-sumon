// this 
// this is a current object or current instance 
class Calc{
    int num1;
    int num2;
    int result;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

}


public class ObjectDemo3 {
    public static void main(String[] args) {
        Calc obj = new Calc(12,15);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
        
    }
}