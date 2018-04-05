import java.util.Scanner;
import java.util.* ;

class Lists { 

public static final int ADD = 1;
public static final int REMOVE = 2;
public static final int VIEW = 3;
public static final int TERMINATE = 4;

public static int mode = -1;

public static int addindex = -1;
public static ArrayList<String> toDoList = new ArrayList<String>();

public static void main(String[] args) {
    Scanner scan;
    while(true) {
        //Loop to select mode.
        //This loop is infinite until the user selects the "Quit" option (3)
        scan = new Scanner(System.in);
        printModeStatement();
        if(scan.hasNextInt()) {
            mode = scan.nextInt();
            
            if(mode == ADD) {
                while(true){
                scan = new Scanner(System.in);
                    System.out.print("What index would you like to add the item in?: ");
                    if(scan.hasNextInt()){
                    addindex = scan.nextInt();
                    }
                    if(scan.hasNext()){
                    System.out.print("Write the to do list item:\t");
                    String toDolistitem = scan.nextLine();
                    toDoList.add(addindex, toDolistitem);
                    break;
                    }
                }
            }
            else if(mode == REMOVE) {
                while(true){
                    scan = new Scanner(System.in);
                    System.out.print("What index would you like to remove?: ");
                    if(scan.hasNextInt()){
                        int indexremove = scan.nextInt();
                        toDoList.remove(indexremove);
                    }
                }
            }
            else if (mode == VIEW){
                for(int i = 0; i < toDoList.size(); i++) {
                     System.out.println(toDoList.get(i));
                     System.out.println(spaces[]);
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

   public static void printModeStatement() {
       System.out.println(toDoList);
        System.out.print(
            "Main Menu:\n"
            + "\t(1) Add an item\n"
            + "\t(2) Remove an item\n"
            + "\t(3) View List\n"
            + "\t(4) Quit \n"
        );
    }
}
