import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> values  = new HashSet<>(); // to get a nos in proper order we can sort using TreeSet<>()
        values.add(6);
        values.add(7);
        values.add(9);
        values.add(6);   // it will not print 6 bcoz java doesnt print integers repeatedly...

        for(int i :  values){
            System.out.println(i);
        }
    }
}
