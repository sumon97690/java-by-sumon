public class prac6 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=7;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i==7 ||k==1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int l=1;l<=i;l++){
                if(l==i||i==7){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // for(int i=1;i<=7;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("#");
        //     }
        //     System.out.println();
        // }

    }
}
