import java.util.Scanner;


public class prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:  ");
        int a = sc.nextInt();
        boolean isprime  = true;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                isprime  =false;
                break;
            }
            
        }
        if(isprime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
