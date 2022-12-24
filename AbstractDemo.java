// Abstract method- once u created a abstract class no one can create a object of it.

abstract class Human{ // abstract class
    public abstract void eat();    //no object will be used
    public void walk() {
        
    }
}
class man extends Human{   //  concrete class
    public void eat() {
        System.out.println("helllo");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Human obj = new man();   // if we have  to use  ojjectt we  have to create a new class 
        obj.eat();
    }
}
