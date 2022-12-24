public class OperatorDemo {
    // Arithmetic +,-,*,/,%
    // Bitwise  << >>
    // Relational
    // Logical

    public static void main(String[] args) {
        int m  = 4;
        int  n =  5;
        m+=n;
        System.out.println(m);
        int a = 6;
        int b = 7;
        a++;
        b=a++;

        // a++ post increment
        // ++a pre increment

        System.out.println(a);
        System.out.println(b);

        int k = 8, l = 4;
        int r = k+l;
        int s = k -l;
        int o = k*l;
        int p = k/l;
        int q= k%l;
        System.out.println(r);
        System.out.println(s);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
    }
}
