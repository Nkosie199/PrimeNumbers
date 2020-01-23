import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String args[]){   
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        ArrayList<String> words; //stores the words
        String [] s = sc.nextLine().split(" ");
        words = new ArrayList<>(Arrays.asList(s));
        String finalSentence = "";
        for (int i = (words.size()-1); i>0; i--) { //for each word (in reverse order)
            String w = words.get(i);
            finalSentence += w+" ";
        }
        System.out.println("The reversed sentence is: "+finalSentence);
    }  
}
