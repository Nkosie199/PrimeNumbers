import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers{    
    public static void main(String args[]){   
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int n = Integer.parseInt(sc.nextLine()); //n is the number to be checked 
        ArrayList<Integer> primes = new ArrayList<>();//stores the first n prime numbers
        int currentNumber =  2; //since 2 is the first prime number
        while (primes.size() < n) {
            boolean prime = true;
            for (int i = 2; i < currentNumber; i++) { //this loop iterates between the denominator 2 and current number
                if (currentNumber%i==0){ //if the number is perfectly divisible by a number not in the range, it is not a prime 
                    //System.out.println(currentNumber+" is not a prime");
                    prime = false;
                    break;
                }
            }
            if (prime==true){
                //System.out.println(currentNumber+" is a prime");
                primes.add(currentNumber);
            }
            currentNumber++; //go to the next number
        }
        //now sum the primes...
        int accumulator = 0;
        for (int i: primes) {
            accumulator += i;
        }
        System.out.println("The sum is "+accumulator);
    }    
}  