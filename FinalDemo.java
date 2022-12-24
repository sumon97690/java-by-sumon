// Final keyword-- its like a const it is used in methods, variables
class A{
    final int i = 0; // constant 
    public A(){
        i = 10; // --- 10 will not be printed it will throw an error that we cannot assign a value to final variable
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.i);
    }
}
