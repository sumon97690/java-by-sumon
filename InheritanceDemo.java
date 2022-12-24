// single and multi level inheritance

class Calculator{   // Super class,parent, base
    public int add(int i, int j) {
        return i+j;
    }
}
class Calcadv extends Calculator{   // Sub class, child,derived 
    public int sub(int i, int j) {
        return i-j;
    }
}
class Calcveryadv extends Calcadv{
    public int multi(int i, int j) {
        return i*j;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calcadv c2 = new Calcadv();
        Calcveryadv c3 = new Calcveryadv();
        int result3 = c3.multi(6,4);
        int result4 = c3.add(60,4);
        int result5 = c3.sub(51,4);
        

        int result1 = c2.add(5,4);
        int result2 = c2.sub(10,4);

        int result = c1.add(5,4);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
