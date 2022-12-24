public class selectionDemo3 {
    public static void main(String[] args) {
        int i=5;
        int j = 0;

        // if(i>6){
        //     j=1;
        // }
        // else{
        //     j=2;
        // }

        // by using ternary operators
        // ?: => condition?expr1:expr2
        j = i>6?1:2;

        System.out.println(j);
    }
}
