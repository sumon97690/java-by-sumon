class methodoverloading{
    public void add(int i, int j) {
        System.out.println(i+j);
    }
    public void add(int i, int j, int k) {
        System.out.println(i+j+k);
    }
    public void add(double i, double j) {
        System.out.println(i+j);
    }
}

public class sumon3 {
    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        obj.add(4,5);
        obj.add(5,4,8);
        obj.add(4.5,6.4);


    }
}
