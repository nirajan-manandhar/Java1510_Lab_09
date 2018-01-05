/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.Scanner;

/**
 * Tests the RandomWalker class.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 * 
 */
public class TestWalker {

    /**
     * Drives the program.
     * 
     * @param args
     *            unused.
     */
    public static void main(String[] args) {
        final int max = 5;
        final int boundary = 10;
        Scanner scan = new Scanner(System.in);

        RandomWalker walker = new RandomWalker(max, boundary);
        System.out.println("Enter a new number for maximum steps");
        int maxSteps2 = scan.nextInt();
        System.out.println("Enter a new number for the boundary");
        int boundary2 = scan.nextInt();
        scan.close();
        RandomWalker walker2 = new RandomWalker(maxSteps2, boundary2);

        System.out.println(walker.toString());
        System.out.println(walker2.toString());
        
        int maxstep = 1;
        final int upper = 50;
        
        while (maxstep < upper) {
            walker.takeStep();
            walker2.takeStep();
            System.out.println(walker.toString());
            System.out.println(walker2.toString());
            maxstep++;
            System.out.println("\nWalker 1 maximum distance:" 
            + walker.getMaximumDistance());
            System.out.println("Walker 2 maximum distance:" 
            + walker2.getMaximumDistance());
        }
    }
}
