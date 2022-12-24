// Conswtructor overloading
class Casio{
    int num1;
    int num2;
    String operation;
    public Casio(){
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }
    public Casio(int i){
        num1 = i;
        num2 = 0;
        operation = "Nothing";

    }
    public Casio(int i, int j){
        num1 = i;
        num2 = j;
        operation = "Nothing";
    }
    public Casio(int i, int j, String op){
        num1 = i;
        num2 = j;
        operation = "op";
    }
}

public class MethodOverloadingDemo2 {
    public static void main(String[] args) {
        Casio obj = new Casio(5,4,"add");
        System.out.println(obj.num1);
        System.out.println(obj.num2);
        System.out.println(obj.operation);

    }
}
