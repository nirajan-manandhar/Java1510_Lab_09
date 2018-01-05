/**
 * 
 */
package ca.bcit.comp1510.lab9;

/**
 * Creates a name object.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Name implements Comparable<Name> {
    
    /**
     * Instantiates a new String object, first.
     */
    private final String first;
    
    /**
     * Instantiates a new String object, middle.
     */
    private final String middle;
    
    /**
     * Instantiates a new String object, last.
     */
    private final String last;
    
   
    /**
     * Constructs a name object.
     * 
     * @param first a String.
     * @param middle a String.
     * @param last a String.
     * @throws IllegalArgumentException an exception
     */
    public Name(String first, String middle, String last) {
        
        if (!first.trim().equals("") || !middle.trim().equals("") 
                || !last.trim().equals("")) {
            
            if (middle == null) {
                this.middle = "";
            } else {
                this.middle = middle;
            }
            this.first = first;
            this.last = last;
        } else {
        throw new IllegalArgumentException("Cannot have an empty String");
        }
    }

    /**
     * Returns the first name.
     * @return the first
     */
    public String getFirst() {
        return first;
    }

    /**
     * Returns the middle name.
     * @return the middle
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Returns the last name.
     * @return the last
     */
    public String getLast() {
        return last;
    }

    @Override
    public int compareTo(Name o) {
        if (!this.last.equals(o.getLast())) {
            return (this.last.compareTo(o.getLast()));
            
        } else if (!this.middle.equals(o.getMiddle())) {
            return (this.middle.compareTo(o.getMiddle()));
            
        } else if (!this.first.equals(o.getFirst())) {
            return (this.first.compareTo(o.getFirst())); 
        }
        return 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Name [first=" + first + ", middle=" 
                + middle + ", last=" + last + "]";
    }
    
    

}
