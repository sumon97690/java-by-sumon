// Anonymous inner class
interface Abc{
    void show();
}


public class AnonymousExample1 {
    public static void main(String[] args) {
        Abc obj = new Abc(){
            public void show() {
            System.out.println("anything");
    }
        };
        obj.show();
    }
}