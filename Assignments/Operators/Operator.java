import java.util.Random;

class Operator {
    public static void main(String[] args) {
        
        // String name = "Fernando";
        // System.out.println(name);

        // String fullName = "Fernando Rivero";
        // System.out.println(fullName);

        // String firstName = "Fernando";
        // String lastName = "Rivero";
        // String fullName = firstName + " " + lastName;
    
        // System.out.println(firstName);
        // System.out.println("firstName");
        // System.out.println(lastName);
        // System.out.println("lastName");
        // System.out.println(fullName);
        // System.out.println("fullName");

        // int currentYear = 18;
        // int yearsUntilGraduation = 1;
        // int myGradYear = currentYear + yearsUntilGraduation;
    
        // System.out.println(myGradYear);
        // System.out.println("myGradYear");

        // int currentAge = 16;
        // int nextAge = currentAge + 1;
        // System.out.println(currentAge);
        // System.out.println(nextAge);

        // int halfCurrentAge = currentAge / 2;
        // int halfNextAge = nextAge / 2;
        // System.out.println(halfCurrentAge);
        // System.out.println(halfNextAge);

        // //"Modulo" is the name of the '%' operator. Can you figure out what the modulo operator is doing?
        // int moduloCurrentAge = currentAge % 2;
        // int moduloNextAge = nextAge % 2;
        // System.out.println(moduloCurrentAge);
        // System.out.println(moduloNextAge);

        // double bitcoinsOwned = 5;
        // double bcsCoinsOwned = 2;
    
        // double bitcoinValue = 10000;
        // double bcsCoinValue = 0;
    
        // double bitcoinsWorth = bitcoinsOwned * bitcoinValue;
        // double bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue;
        // System.out.println("My current bitcoins are worth $" + bitcoinsWorth);
        // System.out.println("My current BCSCoins are worth $" + bcsCoinsWorth);
    
        // //Let's assume I can get it so you can redeem 25 BCSCoins for a $5 giftcard.
        // double reward = 5;
        // double amtToRedeem = 25;
        // bcsCoinValue = reward / amtToRedeem; //Reassign bcsCoinValue to the potential
        // System.out.println("One BCSCoin might be worth $" + bcsCoinValue + " later. If so...");
    
        // bcsCoinsWorth = bcsCoinsOwned * bcsCoinValue; //This is the exact same calculation we used earlier, but we updated bcsCoinValue, so let's calculate it again.
        // System.out.println("My current BCSCoins could eventually be worth $" + bcsCoinsWorth);   
        
        // Boolean haveJob = false;
        // Boolean lookingForWork = true;
        // Boolean canProgram = true;
        // int currentSavings = 200;
    
        // //There are some print statements below. Can you guess which ones will print?
        // if(!haveJob) {
        //     if(lookingForWork && canProgram) {
        //         System.out.println("Your chances as getting a job go up!");
        //     }
        //     else {
        //         System.out.println("You might need to gain more skills before you can get a job.");
        //     }
        // }
        // if(currentSavings < 500) {
        //     System.out.println("You should be saving more money.");
        // }
        // else {
        //     System.out.println("Do you need to save more money, still?");
        // }

        // double monthsSaved = 2; 
        // double savingsPerMonth = 300;
        // double savingsGoal = 1200;
        // double monthsToSave = savingsGoal / (savingsPerMonth * monthsSaved);
        // double totalMoneySaved = savingsPerMonth * monthsSaved;
        // if(totalMoneySaved < savingsGoal) {
        //     System.out.println("You need to save for " + monthsToSave + " more months to reach $" + savingsGoal);
        // }
        // else {
        //     System.out.println("You have saved enough money");
        // }

        for(int n = 0; n < 10; n++){
        Random r = new Random();
        String Nouns[]={"Winston ","He ","Jax ","Trevor ","Nathan ","John "};
        String Verbs[]={"Danced ","Jumped ","Ran ","Programmed ","Laughed "};
        String Adjective[]={"Badly","Incredibly","Loudly","Terribly","Quickly"};
        int n1 = r.nextInt(Nouns.length);
        int n2 = r.nextInt(Verbs.length);
        int n3 = r.nextInt(Adjective.length);
        if(n1>=2){
            System.out.println(Nouns[n1]+Verbs[n2]+Adjective[n3]);
        }else  
            System.out.println(Nouns[n1]+Verbs[n2]+Adjective[n3]);
        }
        

    }
}

