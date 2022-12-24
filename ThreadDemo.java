// to print a values after a several seconds thread method is  used.

class hi{
    public void show() {
        for(int i=0;i<=5;i++){
            System.out.println("hiii");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception

            }
        }
    }
}
class hello{
    public void show() {
        for(int i=0;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        hi obj1 = new hi();
        hello obj2 =  new hello();
        obj1.show();
        obj2.show();
    }
}
