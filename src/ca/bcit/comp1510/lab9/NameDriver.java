package ca.bcit.comp1510.lab9;

import java.util.ArrayList;

/**
 * Tests the name class.
 * Is a driver.
 * @author Nirajan Manandhar.
 * @version 1.0
 *
 */
public class NameDriver {
        
    /**
     * Drives the program.
     * @param args unused.
     */
        public static void main(String[] args) {
            ArrayList<Name> names = new ArrayList<Name>();
            
            Name one = new Name("John", "Koolaid", "Elton");
            Name two = new Name("Jane", null, "Doe");
            Name five = new Name("Jane", "Hello", "Doe");

            Name three = new Name("Greg", "Isaac", "Compton");
            Name four = new Name("Greg", "Isaac", "Elton");
            
            names.add(one);
            names.add(two);
            names.add(three);
            names.add(four);
            names.add(five);
           
            names.sort(null);
            
            for (Name name : names) {
                System.out.println(name);
            }
        }
}
