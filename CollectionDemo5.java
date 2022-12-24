import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo5 {
    public static void main(String[] args) {
        // to make a list of  the values
        List<Integer> values  = new ArrayList<>();
        values.add(404);
        values.add(909);  // here 4 is an Integer
        values.add(638);
        values.add(262);

        Comparator<Integer> c = (i,j) -> i%10>j%10?1:-1;
        Collections.sort(values, c);
        
        

        for(Integer o: values){
            System.out.println(o);
        }
    }
}
