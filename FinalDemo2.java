// final keyword-- if we create a final class we cannot extends that class further
final class A{  
    public final void show() {  // if we used final in class A. B cant override A..
        System.out.println("in show");
    }
}
class B extends A{
    public void show() {
        System.out.println("in b");
    }
}
public class FinalDemo2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

