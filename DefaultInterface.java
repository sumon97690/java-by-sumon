// Abstract class -> Defiine and declare
// interface -> declare -> 1.7
// 1.8 can define methods in interface

interface Demo{
    void abc();
    default void show() {  // if we use default instead of public it will accept the body
        System.out.println("in  show");
    }
}
interface myDemo{
    default void show() {
        System.out.println("in myDemo show");
    }
}
class demoimp implements Demo, myDemo{
    

    public void abc() {
        System.out.println("in abc");
    }

    @Override    //override is used to show the details in interface myDemo bcoz there were 2 interfaces
    public void show() {
        // TODO Auto-generated method stub
        myDemo.super.show();
    }
}
public class DefaultInterface {
    public static void main(String[] args) {
        Demo obj = new demoimp();
        obj.abc();
        obj.show();
    }
}
