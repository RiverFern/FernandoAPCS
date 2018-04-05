import java.util.Scanner;
import java.util.* ;
class string {

public static ArrayList<Integer> spaces = new ArrayList<Integer>();
public static ArrayList<Integer> punctuation = new ArrayList<Integer>();
public static ArrayList<Integer> listOfIt = new ArrayList<Integer>();

    public static void main(String[] args) {

//   String s = "I'd go, but I'm broke.";

//     char c1 = s.charAt(7);
//     System.out.println(c1);
//     print ","

//     char c2 = s.charAt(10);
//     System.out.println(c);
//     print "u"

//     int idx1 = s.indexOf(',');
//     System.out.println(idx1);
//     print "7"     

//     int idx2 = idx1 + 3;
//     System.out.println(idx2);
//     print "10"

//     char c3 = s.charAt(idx1);
//     System.out.println(c3);
//     print ","

//     char c4 = s.charAt(s.indexOf(c2) + 2);
//     System.out.println(c4);
//     print " "
    

//     char c5 = s.charAt(s.length() - 1);
//     System.out.println(c5);
//     print "e"

//     int idx3 = s.indexOf('\'');
//     System.out.println(idx3);
//     print "1"

//     int idx4 = s.indexOf("go");
//     System.out.println(idx4);
//     print "5"
    
String g = "Given the circumstances, I'm not sure if it was a success, but it certainly seems promising.";

        for(int i = 0; i < g.length(); i++){
            char e1 = g.charAt(i);
            if(e1 == ' '){
                spaces.add(i);
            }
            if(e1 == ','){
                punctuation.add(i);
            }
            if(e1 == '.'){
                punctuation.add(i);
            }
        }
        System.out.print("space at: ");
        for(int i = 0; i < spaces.size(); i++){
        System.out.print(spaces.get(i) + " ");
        }
        System.out.println();
        System.out.print("punctuation at: ");
        for(int i = 0; i < punctuation.size(); i++){
        System.out.print(punctuation.get(i) + " ");
        }
    }
}