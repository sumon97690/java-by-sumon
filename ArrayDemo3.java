// jagged arrays (elements in the array are not equal)

public class ArrayDemo3 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {2,4,8};
        int c[] = {5,6,7,8};

        int d[][] = {  // jagged array
            {1,2,3,4},
            {2,4,8},
            {5,6,7,8}
        };

        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }
        // System.out.printIn(d[2][2]);
    }
}
