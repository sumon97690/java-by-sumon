class A{
    public void show(){
        System.out.println("In A");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B");
    }
}
class C extends A{
    public void show(){
        System.out.println("In C");
    }
}

public class sumon8 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
}
