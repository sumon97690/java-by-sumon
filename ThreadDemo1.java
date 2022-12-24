// extending thread in the class
class hi extends Thread{ //thread is used to print hi, hello simulteneously
    public void run() {  //run is an  internal method of thread
        for(int i=0;i<=5;i++){
            System.out.println("hiii");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception

            }
        }
    }
}
class hello extends Thread{
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        hi obj1 = new hi();
        hello obj2 =  new hello();
        // obj1.show();
        // obj2.show();
        obj1.start();
        try {
                Thread.sleep(10);
            } catch (Exception e) {
                //TODO: handle exception

            }
        obj2.start();    // for thread  method we have to  use start 
    }
}


