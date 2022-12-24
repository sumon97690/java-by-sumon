// Anonymous inner class --- another method to override the class
class A{
    public void show() {
        System.out.println("in A");
    }
}


public class AnonymousExample {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("i am the best in the world");
            }
        };
        obj.show();
    }
}
