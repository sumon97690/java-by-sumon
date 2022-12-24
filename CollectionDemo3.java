import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo3 {
    public static void main(String[] args) {
        // to make a list of  the values
        List<Integer> values  = new ArrayList<>();
        values.add(4);  // here 4 is an Integer
        values.add(6);
        values.add(9);
        values.add("sumon"); // error will occur bcoz we have given string here

        for(int i=0;i<values.size();i++){
            System.out.println(values.get(i));
        }
    }
}
