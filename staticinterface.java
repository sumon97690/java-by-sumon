interface Demo{
    int i = 8;
    void abc();
    static void show(){   // when we use static there is no need to declare object
        System.out.println("hello guyzzz");
    }
}
class myDemo implements Demo{
    public void abc() {
        i = 9;  // we cannot define i in this class bcoz i in interface is the final variable
    }
}

public class staticinterface {
    public static void main(String[] args) {
        Demo.show();
    }
}
