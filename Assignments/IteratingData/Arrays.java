public class Arrays{
public static void main(String[] args) {
//Exercise 1
        int[] NUMS = new int[201];
        for(int i = 0; i < NUMS.length; i++){
            NUMS[i]+=i;
            System.out.print(NUMS[i] - 100);
        }

//Exercise 2
        for(int i = 0; i < NUMS.length; i++){
            NUMS[i]+=i;
            System.out.print(Math.abs(NUMS[i] - 100));
        }

//Exercise 3
        int[] FIBB = new int[40];
        FIBB[0] = 0;
        FIBB[1] = 1;
        System.out.println(FIBB[0]);
        System.out.println(FIBB[1]);
        for(int i = 2; i < FIBB.length; i++){
            FIBB[i] = FIBB[i-2] += FIBB[i-1];
            System.out.println(FIBB[i]);
        }

//Exercise 4
        int[] numbers;
        for(int numb : numbers){
            if(numb % 2 == 1){
                System.out.println(numb);
            }
        }

//Exercise 5
        String[] messages;
        for(String mess : messages){
            if(mess.length() >= 10){
                System.out.println(mess);
            }
        }
    }
}