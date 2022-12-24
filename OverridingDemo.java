// overriding method

class A{
    public void show() {
        System.out.println("In A");
    }
}
class B extends A{
    
    public void show() {
        super.show();    // we can use super method to show the elements  in class A
        System.out.println("In B");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
    }
}
