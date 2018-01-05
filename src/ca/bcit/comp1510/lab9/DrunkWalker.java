/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.Scanner;

/**
 * Simulates a drunk walker.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class DrunkWalker {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        int counter = 0;
        
        System.out.println("What is the number of steps and the boundary?");
        Scanner scan = new Scanner(System.in);
        int steps = scan.nextInt();
        int boundary = scan.nextInt();
        System.out.println("How many simulations do you want to run?");
        int drunks = scan.nextInt();
        scan.close();
        for (int i = 0; i < drunks; i++) {
            
            RandomWalker walker = new RandomWalker(steps, boundary);
            walker.walk();

            if (!walker.inBounds()) {
                counter++;
            }
        }
        
        System.out.println(counter + "/" + drunks);
    }

}
