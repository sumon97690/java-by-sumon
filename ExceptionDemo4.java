// user defined try catch
public class ExceptionDemo4 {
    public static void main(String[] args) {
        int i = 4;
        int j = 8;
        
        try {
            int k = i/j;
            if(k==0) throw new Exception();
            System.out.println(k);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("error");
        }
    }
}
