/**
 * 
 */
package ca.bcit.comp1510.lab9;

/**
 * Checks if two particles
 * have collided.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Collisions {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        final int steps = 100000;
        final int boundary = 2000000;
        final int startx = 3;
        
        RandomWalker p1 = new RandomWalker(steps, boundary);
        RandomWalker p2 = new RandomWalker(steps, boundary);
        int collisionCount = 0;
        
        p1.setCurrentXCoord(-startx);
        p1.setCurrentYCoord(0);
        
        p2.setCurrentXCoord(startx);
        p2.setCurrentYCoord(0);
        
        
        for (int i = 0; i < steps; i++) {
            p1.takeStep();
            p2.takeStep();

            if (samePosition(p1, p2)) {
                collisionCount++;
                
                System.out.println("\nPARTICLE ONE:");
                System.out.println("Particle one's maximum distance is: " 
                + p1.getMaximumDistance());
                System.out.print("X COORD: " + p1.getCurrentXCoord());
                System.out.println("\tY COORD: " + p1.getCurrentYCoord());
                System.out.println("Current Steps: " + p1.getCurrentSteps());
                
                System.out.println("PARTICLE TWO:");
                System.out.println("Particle two's maximum distance is: " 
                + p2.getMaximumDistance());
                System.out.print("X COORD: " + p2.getCurrentXCoord());
                System.out.println("\tY COORD: " + p2.getCurrentYCoord());
                System.out.println("Current Steps: " + p2.getCurrentSteps());
            }
        }
        System.out.println("\nThere were " + collisionCount + " collisions.");
    }
    
    /**
     * Checks if the two particles are 
     * in the same place, if they
     * have collided.
     * 
     * @param one a RandomWalker
     * @param two a RandomWalker
     * @return a boolean
     */
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        int p1x = one.getCurrentXCoord();
        int p1y = one.getCurrentYCoord();
        int p2x = two.getCurrentXCoord();
        int p2y = two.getCurrentYCoord();
        
        if (p1x == p2x && p1y == p2y) {
            return true;
        }
        return false;
    }

}
