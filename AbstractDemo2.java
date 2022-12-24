abstract class pencil{
    public abstract void write();
        public void walk() {
            System.out.println("pencil");
        }
}
abstract class pen extends pencil{
    public abstract void write();
    public void walk() {
        System.out.println("pen");
    }
    
}
class writer extends pen {
    public void write() {
        System.out.println("hello");
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        pencil obj = new writer();
        obj.write();
        obj.walk();
    }
}
