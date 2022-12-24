import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        // to make a collection of  the values
        Collection values  = new ArrayList<>();
        values.add(4);
        values.add(6);
        values.add(9);

        System.out.println(values);
        //to print values seperately we have to use iterator

        Iterator it = values.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
