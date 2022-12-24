// final keyword-- if we create a final class we cannot extends that class further
final class A{  // if we used final in class A and then run it will show an error bcoz u cant extend A in B bcoz its an final class.
    public void show() {
        System.out.println("in show");
    }
}
class B extends A{

}
public class FinalDemo1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
