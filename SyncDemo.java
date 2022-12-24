// Thread- it is a short cut method instead of  using public method in class we can use method in thread object
class Counter{
    int count;
    public synchronized void increment() { // if we use synchronized method ....when t1 will work t2 will wait and when t2 will work t1 will wait..  
        count++;
    }
}
public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() ->  {
            for(int i=1; i<=1000;i++){
                c.increment();
            }
        });
        Thread t2 = new Thread(() ->  {
            for(int i=1; i<=1000;i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count " + c.count);
    }
}
