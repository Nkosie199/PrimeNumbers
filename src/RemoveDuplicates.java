import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String args[]){   
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        ArrayList<String> ch; //stores the characters
        String [] s = sc.nextLine().split("");
        ch = new ArrayList<String>(Arrays.asList(s));
        ArrayList<String> finalStr = new ArrayList<String>();
        String finalString = "";
        for (String st: ch) { //for each character
            if (!finalStr.contains(st)){ //if not a duplicate
                finalStr.add(st); //add it to the final string
                finalString += st;
            }
        }
        System.out.println("The final string without duplicates is: "+finalString);
    }  
}
