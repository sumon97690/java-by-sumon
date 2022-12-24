// Thread demo using anonymous function and lambda function
// priority
public class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
    
        // obj1.show();
        // obj2.show();
        Thread t1 = new Thread(() -> {  //run is an  internal method of thread
                for(int i=0;i<=5;i++){
                    System.out.println("hiii");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        //TODO: handle exception
                        
                    }
                }

        });
        Thread t2 = new Thread(() ->
        {
                for(int i=0;i<=5;i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            });
            t1.setPriority(Thread.MIN_PRIORITY);
            t2.setPriority(Thread.MAX_PRIORITY);
            System.out.println(t1.getPriority());
            System.out.println(t2.getPriority());

        t1.start();
        try {
                Thread.sleep(10);
            } catch (Exception e) {
                //TODO: handle exception

            }
        t2.start();
        t1.join();   // it is the method in which the "Byee" will print after t1 & t2 thread
        t2.join();
        System.out.println("Byee");  // for thread  method we have to  use start
    }
}
