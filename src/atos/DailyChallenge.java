//Daily Challenge: Coin Flip
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that uses the loops to produce the following output:
 * Date : 01/01/2023
 */

package atos;
import java.util.Random;
public class DailyChallenge {
	public static void main(String[] args) {
		
        // create a new random number generator object
        Random rand = new Random();
        
     // pick a random number between 0 and 1:
        int n = rand.nextInt(2);
        
        // show the number
        
        System.out.println("Number picked is : " + n);

        // if n = 0 show Heads
        if (n == 0) {
            System.out.println("Heads");
        }
            // else show "Tail"
        else {
            System.out.println("Tails");
        }
    }
}
