class stat{
    int eid;
    int salary;
    static String ceo;

    public void show() {
        System.out.println(eid + ":" + salary + ":" + ceo);
    }
}
public class sumon4 {
    public static void main(String[] args) {
        stat navin = new stat();
        navin.eid = 5;
        navin.salary = 50000;

        stat rahul = new stat();
        rahul.eid = 6;
        rahul.salary = 60000;

        rahul.ceo  = "ankit";

        navin.show();
        rahul.show();



    }
}
