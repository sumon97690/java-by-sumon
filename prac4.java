import java.util.Scanner;


public class prac4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int i  =  2, small = 0, large=0;
        System.out.print("Num 1:   ");
        int a = sc.nextInt();
        a= small;
        a=  large;

        while(i<=10){
            System.out.print("Num"+ i + ": ");
            int b = sc.nextInt();
            if(b<small){
                small=b;
            }
            if(b>large){
                large=b;
            }
            i++;
        }
        System.out.print("larger: " +large + "Smaller: " +small);

    }
}
