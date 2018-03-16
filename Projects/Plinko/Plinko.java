import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;
    public static int score = -1;

    public static int position = -1;
    public static int numbOfDisc = -1;

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
                            if(position <= 8){
                                position = position * 2;  
                                    PrintEvenRow(position);
                                    for(int i = 0; i <= 11; i++){
                                        if(position == 16 ){
                                            position --;
                                        }                                       
                                        else if (position == 0){
                                            position++;
                                        } 
                                        else if(Math.random() > .5){
                                            position++;
                                        }
                                        else{
                                            position--;
                                        }                                  
                                        if(isEven(i)) {
                                        PrintOddRow(position);
                                        }
                                        else{
                                        PrintEvenRow(position);
                                        }       
                                    }
                                System.out.println("You landed on position " + (position / 2) + " and got " + VALUES[position/2] + " points.");
                                }
                            } 
                        break;
                        }
                    }
                else if(mode == MULTI_DISC) {
                int[] DISCPOSITION = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    while(true){
                        scan = new Scanner(System.in);
                            System.out.print("What starting position would you like the ball to be in? (0-8): ");
                            if(scan.hasNextInt()){
                                int startingPosition = scan.nextInt();
                                if(startingPosition <= 8){
                                System.out.print("How many discs would you like to drop?: ");
                                numbOfDisc = scan.nextInt();
                                    for(int j = 1; j <= numbOfDisc; j++){
                                    position = startingPosition * 2;
                                        for(int i = 0; i <= 11; i++){
                                            if(position == 16 ){
                                                position --;
                                            }                                       
                                            else if (position == 0){
                                                position++;
                                            } 
                                            else if(Math.random() > .5){
                                                position++;
                                            }
                                            else{
                                                position--;
                                            }                                  
                                        }
                                    DISCPOSITION[position/2]++; 
                                    }
                                    for(int j = 0; j <= 8; j++){
                                    System.out.println("Number of disc(s) landed on position " + j + ": "+ DISCPOSITION[j]);      
                                }
                            }
                        }
                    score = (VALUES[0] * DISCPOSITION[0]) + (VALUES[1] * DISCPOSITION[1]) + (VALUES[2] * DISCPOSITION[2]) + (VALUES[3] * DISCPOSITION[3]) + (VALUES[4] * DISCPOSITION[4]) + (VALUES[5] * DISCPOSITION[5]) + (VALUES[6] * DISCPOSITION[6]) + (VALUES[7] * DISCPOSITION[7]) + (VALUES[8] * DISCPOSITION[8]);
                    System.out.println("Score: " + score);
                    break;
                    }   
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
        System.out.print(" |");
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
        System.out.print("|");
        System.out.print("\n");
            return position;
    }
    
    public static int PrintEvenRow(int position) {
        System.out.print(" |");
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
        System.out.print("|");
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