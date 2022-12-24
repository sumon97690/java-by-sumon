// static method
class Emp{
    int eid;
    int salary;
    static String ceo;
// if we used static.. the name of the ceo will be same for all the users
    

// we are using constructors method below so that if the eid and salary wont there the default eid, salary and ceo will be the given details in the constructor

    static{   // when u load a class
        ceo = "larry";
    }

    public Emp(){  //when u create an object
        eid = 1;
        salary = 50000;
    }
    public void show() {
        System.out.println(eid + ":" + salary + ":" + ceo);
    }
}

public class StaticDemo{
    public static void main(String[] args) {
        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 40000;
        Emp.ceo = "sumon";

        Emp rahul = new Emp();
        rahul.eid = 9;
        rahul.salary = 30000;
        Emp.ceo = "mali";
        // we dont need object for the static method we can use the main class which is a Emp

        Emp.ceo = "Nikita";

        navin.show();
        rahul.show();


    }
}
