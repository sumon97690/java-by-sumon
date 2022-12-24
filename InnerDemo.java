// Inner class
// Member class
// Static class
// Anonymous





class Outer{
    static int a;
    public static void show() {
        
    }

    // class Inner{       // member class
    //     public void display() {
    //         System.out.println("In display");
    //     }
    // }
        static class Inner{           // Outer$Inner.class & static class
        public void display() {
            System.out.println("In display");
        }
    }
}

public class InnerDemo {
    // Variable, method, class
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        // Outer.Inner obj1 = obj.new Inner();  // for non-  static class that is a member class
        // obj1.display();

        Outer.Inner obj1 = new Outer.Inner();   // for static  class we use this syntax
        obj1.display();
        
    }

}
