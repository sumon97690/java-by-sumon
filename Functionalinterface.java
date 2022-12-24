// Types of interface
// 1- normal 
// 2- Single abstract method - functional Interface- lambda expression-Scala
// 3- Marker interface


// Functional interface
interface Abc{
    void show();
}

public class Functionalinterface {
    public static void main(String[] args) {
        Abc obj =() -> System.out.println("i m the best"); //lambda expression
        obj.show();
    }
}
