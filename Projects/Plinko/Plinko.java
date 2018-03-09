import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;

    public static int position = -1;

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                
                if(mode == SINGLE_DISC) {     
                    while(true){
                    scan = new Scanner(System.in);
                        System.out.print("What starting position would you like the ball to be in? (0-8): ");
                        if(scan.hasNextInt()){
                            position = scan.nextInt();
                            position = position * 2;  
                                PrintOddRow(position);
                                for(int i = 0; i <= 11; i++){
                                    if(position == 16 ){
                                        position --;
                                    }                                       
                                    else if (position == 0){
                                        position++;
                                    } 
                                    if(Math.random() > .5){
                                        position++;
                                    }
                                    else{
                                        position--;
                                    }                                  
                                    if(isEven(i)) {
                                    PrintEvenRow(position);
                                    }
                                    else{
                                    PrintOddRow(position);
                                    }       
                                } 
                            System.out.println("You landed on position " + position + ".");
                            break;
                            } 
                        }
                    }
                else if(mode == MULTI_DISC) {
                    System.out.println("Mode not yet implemented");
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;

                }
            }
        }
    }



    public static int PrintOddRow(int position) {
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print("O");
            }
            else if(isOdd(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
        System.out.print("\n");
            return position;
    }
    
    public static int PrintEvenRow(int position) {
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print("O");
            }
            else if(isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
        System.out.print("\n");
            return position;
    }

    public static Boolean isEven(int i) {
        return i % 2 == 0;
    }
    public static Boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
}