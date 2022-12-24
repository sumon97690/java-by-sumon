public class ArrayDemo {
    public static void main(String[] args) {
        // if we dont know the values
        int nums[] = new int[5];
        nums[0] = 54;
        nums[1] = 41;
        nums[2] = 21;
        nums[3] = 55;
        nums[4] = 75;
        
        for(int i=0;i<5;i++){   // using for loop to print all the values stored in the array
            System.out.println(nums[i]);
        }

        System.out.println(nums[4]);

    }
}
