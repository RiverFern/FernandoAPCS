public class Arrays{
public static void main(String[] args) {

        int[] NUMS = new int[201];
        // for(int i = 0; i < NUMS.length; i++){
        //     NUMS[i]+=i;
        //     System.out.print(NUMS[i] - 100);
        // }

        // for(int i = 0; i < NUMS.length; i++){
        //     NUMS[i]+=i;
        //     System.out.print(Math.abs(NUMS[i] - 100));
        // }

        int[] FIBB = new int[40];
        FIBB[0] = 0;
        FIBB[1] = 1; 
        for(int i = 2; i < FIBB.length; i++){
            FIBB[i-2] += FIBB[i-1];
            System.out.print(FIBB[i]);
        }

    }
}