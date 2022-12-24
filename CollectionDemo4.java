import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo4 {
    public static void main(String[] args) {
        // to make a list of  the values
        List<Integer> values  = new ArrayList<>();
        values.add(10);
        values.add(2);  // here 4 is an Integer
        values.add(6);
        values.add(4);

        Collections.sort(values);
        Collections.reverse(values);
        
        

        for(Integer o: values){
            System.out.println(o);
             
        }
    }
}
