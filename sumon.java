class calc{
    int num1;
    int num2;
    int result;

    public void perform(){
        result = num1 + num2;
    }
}
public class sumon{
    public static void main(String[] args) {
        calc obj = new calc();
        obj.num1 = 5;
        obj.num2 = 10;
        obj.perform();
        System.out.println(obj.result);
    }
}
