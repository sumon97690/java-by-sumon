class A{
    public A(){
        System.out.println("In A");
    }
    public A(int i){
        System.out.println("in int A");
    }
}
class B extends A{
    public B(){
        System.out.println("In B");
    }
    
    public B(int i){
        super(i);
        System.out.println("in int B");
    }
}

public class sumon7 {
     public static void main(String[] args) {
         B obj = new B(5);

     }
}
