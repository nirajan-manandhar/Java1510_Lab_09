/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.Random;

/**
 * Walks a robot.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class RandomWalker {
    
    /**
     * Declares the current x coordinate.
     */
    private int currentXCoord;
    
    /**
     * Declares the current y coordinate.
     */
    private int currentYCoord;
    
    /**
     * Declares the maximum number of steps.
     */
    private int maxSteps;
    
    /**
     * Declares the current number of steps.
     */
    private int currentSteps;
    
    /**
     * Declares the boundary of the 
     * square that the walker inhabits.
     */
    private int boundary;
    
    /**
     * Declares the maximum distance from
     * the origin.
     */
    private int maximumDistance;
    
    /**
     * Constructs a RandomWalker object.
     * @param maxSteps an int.
     * @param boundary an int.
     */
    public RandomWalker(int maxSteps, int boundary) {
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        this.currentXCoord = 0;
        this.currentYCoord = 0;
        this.currentSteps = 0;
        this.maximumDistance = 0;
        
    }

    /**
     * Constructs a RandomWalker object.
     * @param currentXCoord an int.
     * @param currentYCoord an int.
     * @param maxSteps an int.
     * @param boundary an int.
     */
    public RandomWalker(int currentXCoord, int currentYCoord,
            int maxSteps, int boundary) {
        this.currentXCoord = currentXCoord;
        this.currentYCoord = currentYCoord;
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        this.currentSteps = 0;
        this.maximumDistance = 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "RandomWalker [currentXCoord=" + currentXCoord 
                + ", currentYCoord=" + currentYCoord + ", currentSteps="
                + currentSteps + "]";
    }
    
    /**
     * Increments the step in a random direction.
     */
    public void takeStep() {
        final int max = 4;
        final int three = 3;
        Random rand = new Random();
        int num = rand.nextInt(max);
        currentSteps++;
        
        switch (num) {
        
        case 0:
            currentXCoord++;   
            break;
            
        case 1:
            currentXCoord--;
            break;

        case 2:
            currentYCoord++;
            break;

        case three:
            currentYCoord--;
            break;
            
        default: 
            System.out.println("Error in the switch statement.");
            break;
        }
        maximumDistance = max(currentXCoord, currentYCoord);
    }
    
    /**
     * Helper method for takeStep.
     * @param a an int.
     * @param b an int.
     * @return a boolean.
     */
    private int max(int a, int b) {
        if (Math.abs(a) >= Math.abs(b)) {
            return a;
        }
        return b;
    }
    
    /**
     * Checks if the current 
     * number of steps has gone over
     * the limit of max steps.
     * @return a boolean.
     */
    public boolean moreSteps() {
        if (this.currentSteps < this.maxSteps) {
            return true;
        }
        return false;
    }
    
    /**
     * Checks if the current
     * coordinates are within the 
     * set boundaries.
     * @return a boolean.
     */
    public boolean inBounds() {
        if (currentXCoord > boundary || currentXCoord < -boundary
                || currentYCoord > boundary || currentYCoord < -boundary) {
            return false;
        }
        return true;
    }
    
    /**
     * Continues to execute the takeStep
     * methods as long as the the inBounds
     * and moreSteps return true.
     */
    public void walk() {
        while (inBounds() && moreSteps()) {
            takeStep();
        }
    }

    /**
     * Returns the maximum distance value.
     * @return the maximumDistance
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }

    /**
     * Returns the current number of steps taken.
     * @return the currentSteps
     */
    public int getCurrentSteps() {
        return currentSteps;
    }

    /**
     * Return the current x coordinate.
     * @return the currentXCoord
     */
    public int getCurrentXCoord() {
        return currentXCoord;
    }

    /**
     * Sets the current x coordinate.
     * @param currentXCoord the currentXCoord to set
     */
    public void setCurrentXCoord(int currentXCoord) {
        this.currentXCoord = currentXCoord;
    }

    /**
     * Returns the current y coordinate.
     * @return the currentYCoord
     */
    public int getCurrentYCoord() {
        return currentYCoord;
    }

    /**
     * Sets the current Y coordinate.
     * @param currentYCoord the currentYCoord to set
     */
    public void setCurrentYCoord(int currentYCoord) {
        this.currentYCoord = currentYCoord;
    }

}

