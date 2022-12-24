public class JumpDemo {
    public static void main(String[] args) {
        // Continue and break
        for(int i=1;i<=10;i++){
            if(i==6){
                continue;
            }

            if(i==8){
                break;
            }
        
            System.out.println(" the value is " +i);
        }
    }
}
