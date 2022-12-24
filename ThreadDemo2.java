// using implements instead of extends and Runnable method
class hi implements Runnable{ //thread is used to print hi, hello simulteneously
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
class hello implements Runnable{
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

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable obj1 = new hi();
        Runnable obj2 =  new hello();
        // obj1.show();
        // obj2.show();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {
                Thread.sleep(10);
            } catch (Exception e) {
                //TODO: handle exception

            }
        t2.start();    // for thread  method we have to  use start 
    }
}



