interface Abc{
    void show();
}

class implementor implements Abc{
    public void show() {
        System.out.println("anything");
    }
}

public class InterfaceDemo1 {
    public static void main(String[] args) {
        Abc obj = new implementor();
        obj.show();
    }
}
