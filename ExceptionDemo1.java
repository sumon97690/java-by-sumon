// Exceptional handling try and catch

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[6];
            a[6] = 10;
            int i = 7;
            int j = 0;
            int k = i/j;
            System.out.println("the output is " + k);
        }
        catch (ArithmeticException e) { //it handled the error related to the integers or arithmetic problems
            //TODO: handle exception
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){ // it handled the error related to array
            System.out.println("stay in your limits...");
        }
        catch(Exception e){ // it handles any kind of error
            System.out.println("something wrong...");
        }
        // if we want to print a particular Statement we have to use  finally
        finally{
            System.out.println("hello frindssss");
        }
    }
}

