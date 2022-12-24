interface writer{
    void write();
}

class pen implements writer{
    public void write() {
        System.out.println("i am a pen");
    }
}
class pencil implements writer{
    public void write() {
        System.out.println(" i am a pencil");
    }
}
class kit{
    public void doSomething(writer p) {
        p.write();
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        kit k = new kit();
        writer p = new pen();
        writer pc = new pencil();
        k.doSomething(pc);
    }
}
