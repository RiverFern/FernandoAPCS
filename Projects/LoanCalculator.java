

import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;
    public static double InterestPercentage = -1;

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
            scan = new Scanner(System.in);
            System.out.print("Enter your principle loan amount: ");
            loanAmt = scan.nextInt();
            System.out.print("Enter your loan term in years: ");
            loanTerm = scan.nextInt();
            System.out.print("Enter your interest rate: ");
            InterestPercentage = scan.nextDouble();
            interestRate = InterestPercentage / 100;
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        System.out.println("You selected mode " + mode);

        if(mode == 1) {
            flatInterest();
        }
        else {
            System.out.println("Other modes not yet supported."); //Replace this with calls to your appropriate functions            
        }
    }

    public static void flatInterest() {
        double FlatInt = loanAmt * loanTerm * interestRate;
        double InterestOverTerm = loanAmt * interestRate;
        System.out.println("Original Loan Amount: $" + loanAmt);
        System.out.println("Loan Term: " + loanTerm);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest over term: $" + InterestOverTerm);
        System.out.println("Total cost of loan: $" + FlatInt);
    }

    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
}


