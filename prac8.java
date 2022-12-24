import java.util.Scanner;
public class prac8 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int a = sc.nextInt();
        int count = 0, large = 0;
        boolean isprime = true;
        for(int i=1;i<a;i++){
            isprime  = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime && i!=2){
                count++; //count++  is used inorder to get the prime numbers from 2 to a
                large = i;
                isprime = false;
            }

        }
        System.out.println(count+ "    "+ large);
    }
    }
