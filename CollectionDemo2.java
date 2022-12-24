
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        // to make a collection of  the values
        List values  = new ArrayList<>();
        values.add(4);  // here 4 is an Integer
        values.add(6);
        values.add(9);
        values.add(2, 8);
        values.add("sumon"); // we can also add object

        for(int i=0;i<values.size();i++){
            System.out.println(values.get(i));
        }
    }
}
