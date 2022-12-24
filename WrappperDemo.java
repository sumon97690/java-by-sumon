public class WrappperDemo {
    public static void main(String[] args) {
        int i  = 5;
        Integer ii  = new Integer(i); // Boxing , wrapping
        int j = ii.intValue(); // unboxing, unwrapping
        Integer value  = i;  //autoboxing
        int k  = value;  //  autounboxing
    }
}
