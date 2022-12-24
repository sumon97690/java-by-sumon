// Exception with resources

import java.io.BufferedReader;
import java.io.InputStreamReader;
// BufferedReader
// Scanner

public class ExceptionDemo3 {
    public static void main(String[] args) throws Exception
    {
        int n=0;
        System.out.println("Enter a number");


        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
                n = Integer.parseInt(br.readLine()); //45
        }
        System.out.println(n);
    }
}

