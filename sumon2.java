class sumonn{
    int num1;
    int num2; 
    public sumonn(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
}
public class sumon2 {
    public static void main(String[] args) {
        sumonn obj  = new sumonn(1,2);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
