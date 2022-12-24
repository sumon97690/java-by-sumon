// Exceptional handling try and catch

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int i = 7;
            int j = 0;
            int k = i/j;
            System.out.println("the output is " + k);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Erorr occured");
        }
        // if we want to print a particular Statement we have to use  finally
        finally{
            System.out.println("hello frindssss");
        }
    }
}
