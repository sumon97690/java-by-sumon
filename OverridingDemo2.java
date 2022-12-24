// Dynamic method dispatch

class A{
    public void show() {
        System.out.println("In A");
    }
}
class B extends A{
    
    public void show() {
        
        System.out.println("In B");
    }
}

class C extends A{
    public void show() {
        System.out.println("in C");
    }
}

public class OverridingDemo2 {
    //  compile time and runtime
    public static void main(String[] args) {     // runtime polymorphism
        A obj1 = new B();  // we an use A obj1 = new B() to show elements in B bcoz A is a super class
        obj1.show();

        obj1 = new C();
        obj1.show(); // Dynamic mehod dispatch
    }
}

