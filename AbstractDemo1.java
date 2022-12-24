class printer{
public void show(Number i) {  //Number i is used so we can use float nos, double nos such as 1.5, 5.5
        System.out.println(i);
    }
}

public class AbstractDemo1 {
    public static void main(String[] args) {
        printer obj  = new printer();
        obj.show(5.5);
    }
}
