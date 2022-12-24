public class VariableDemo {
    public static void main(String[] args) {
        // int, float, double

        long l = 5000; // 8 bytes
        int i = 5; // 4bytes => 32 bits
        short s = 5; // 2bytes => 16 bits -32768 to 32767
        byte b = 5; // 1byte => 8bits -128 to 127
        float f = 5.5f;
        double d = 5.5;

        char c = 'A';
        c = 66; // the output will be B bcoz of ascii rule.
        System.out.println(c);

    }
}
