// Encapsulation-  binding  data with methods
class student{
    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    //getters and setters
    
}


public class EncapsulationDemo {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setRollno(10);

        s1.setName("sumon");

        System.out.println(s1.getRollno());
        System.out.println(s1.getName());

    }
}
