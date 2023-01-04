class outer{
    public void show(){
        System.out.println("in show");
    }

    static class inner{
        public void display(){
            System.out.println("in display");
        }
    }
}

public class sumon5 {
    public static void main(String[] args) {
        outer obj = new outer();
        obj.show();

        outer.inner obj1 = new outer.inner();
        obj1.display();
    }
}
