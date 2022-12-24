import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Stud implements Comparable<Stud>{
    int rollno,marks;
    String name;
    public Stud(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Stud [marks=" + marks + ", name=" + name + ", rollno=" + rollno + "]";
    }
    public int compareTo(Stud s){
        return marks>s.marks?1:-1;
    }
    
}
public class CollectionDemo6 {
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(25, 8, "Sumon"));
        studs.add(new Stud(45, 9, "Mahesh"));
        studs.add(new Stud(65, 3, "Solanki"));
        studs.add(new Stud(35, 5, "mali"));

        Collections.sort(studs);
    
    for(Stud s : studs){
        System.out.println(s);
    }
}
}
