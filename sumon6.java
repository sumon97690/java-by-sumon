public class sumon6 {
    public static void main(String[] args) {
        // 1 dimensional array 

        // int nums[] = new int[4];
        // nums[0]  = 64;
        // nums[1]  = 65;
        // nums[2]  = 66;
        // nums[3] = 67;


        // System.out.println(nums[1]);
        // for(int i=0;i<4;i++){
        //     System.out.print(" " +nums[i]);
        // }
            // another method to create an array
            
            // int nums[] = {1,2,3,4};
            // System.out.println(nums[2]);


            // 2 dimensioinal arrray

            int a[] = {1,2,3,4};
            int b[] =  {5,6,7,8};
            int c[] = {9,1,2,3};

            int d[][]= {
                 {1,2,3,4}, 
                 {5,6,7,8}, 
                 {9,1,2,3}
            };
            System.out.println(d[0][1]);

            for(int i=0;i<3;i++){
                for(int j=0; j<4; j++){
                    System.out.println(" "+d[i][j]);
                }
            }
    }
}
